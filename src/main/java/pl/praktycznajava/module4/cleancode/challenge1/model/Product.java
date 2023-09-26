package pl.praktycznajava.module4.cleancode.challenge1.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

// FIXME nieskończona implementacja
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor(staticName = "of")
public class Product {

    String name;
    Price price;
    int stockQuantity;
    double weight;

    public void buy(ShoppingCart shoppingCart) {
        if(this.getStockQuantity() > 0) {
            shoppingCart.addProduct(this);
        }
    }
}
