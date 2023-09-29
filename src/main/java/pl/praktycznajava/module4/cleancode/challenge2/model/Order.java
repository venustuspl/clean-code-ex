package pl.praktycznajava.module4.cleancode.challenge2.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor(staticName = "of")
public class Order {

   private static final double LIMIT_1000 = 1000;

   List<OrderItem> items;
   DeliveryType deliveryType;
   OrderStatus status;
   Address deliveryAddress;
   BigDecimal totalAmount;
   BigDecimal discountAmount;
   BigDecimal deliveryCost;

   public double calculateTotalPrice() {
      double totalPrice = 0.0;
      for (OrderItem orderItem : this.getItems()) {
         double itemPrice = orderItem.getProduct().getPrice() * orderItem.getQuantity();
         totalPrice += itemPrice;
      }

      if (totalPrice > LIMIT_1000) {
         totalPrice = totalPrice * 0.7;
      }
      return totalPrice;
   }
}