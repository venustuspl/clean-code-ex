package pl.praktycznajava.module4.cleancode.challenge2;

import lombok.AllArgsConstructor;
import pl.praktycznajava.module4.cleancode.challenge2.model.Notification;
import pl.praktycznajava.module4.cleancode.challenge2.model.Order;
import pl.praktycznajava.module4.cleancode.challenge2.model.OrderItem;
import pl.praktycznajava.module4.cleancode.challenge2.model.ShipmentStatus;
import pl.praktycznajava.module4.cleancode.challenge2.service.ConfirmationService;
import pl.praktycznajava.module4.cleancode.challenge2.service.NotificationSender;
import pl.praktycznajava.module4.cleancode.challenge2.service.OrderValidator;
import pl.praktycznajava.module4.cleancode.challenge2.service.SendingService;

@AllArgsConstructor
public class Challenge2Service {

    // ---------------------------------------------------------------------------------------------
    // Challenge 2. Zrefaktoryzuj ciało poniższej metody w taki sposób, aby była jasna i czytelna.
    //              Zwróć uwagę na to, aby metody nie miały efektów ubocznych.
    // --------------------------------------------------------------------------------------

    private final SendingService sendingService;
    private final NotificationSender notificationSender;
    private final OrderValidator orderValidator;
    private final ConfirmationService confirmationService;

    public void processOrder(Order order) {
        orderValidator.validate(order);

        updateInventory(order);

        confirmationService.confirm(order, order.calculateTotalPrice());

        sendShipment(order, prepareShipment(order));
    }

    private void sendShipment(Order order, ShipmentStatus shipmentStatus) {
        sendingService.send(order);
        notificationSender.sendNotification(order, Notification.ORDER_SENT, shipmentStatus);
        notificationSender.sendNotification(order, Notification.END_ORDER_PROCESSING);
    }

    private ShipmentStatus prepareShipment(Order order) {
        generateShippingLabel(order);
        updateDeliveryStatus(order);
        return trackShipment(order);
    }



    private void updateInventory(Order order) {
        for (OrderItem orderItem : order.getItems()) {

            int remainingQuantity = orderItem.getProduct().getStockQuantity() - orderItem.getQuantity();
            orderItem.getProduct().setStockQuantity(remainingQuantity);
        }
    }

    private void generateShippingLabel(Order order) {
        // todo generowanie etykiety wysyłkowej
    }

    private void updateDeliveryStatus(Order order) {
        // todo aktualizacja statusu dostawy
    }

    private ShipmentStatus trackShipment(Order order) {
        // todo śledzenie przesyłki
        return ShipmentStatus.IN_PREPARATION;
    }
}
