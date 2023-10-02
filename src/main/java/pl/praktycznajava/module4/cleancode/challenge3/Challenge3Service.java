package pl.praktycznajava.module4.cleancode.challenge3;

import pl.praktycznajava.module4.cleancode.challenge3.model.Order;
import pl.praktycznajava.module4.cleancode.challenge3.model.OrderItem;
import pl.praktycznajava.module4.cleancode.challenge3.model.Product;

import java.math.BigDecimal;

public class Challenge3Service {

    // -----------------------------------------------------------------------------------------------------
    // Challenge 3. Zrefaktoryzuj ciało poniższej metody w taki sposób, aby była jasna i czytelna.
    //              Zwróć uwagę na ilość wcięć. Napisz kod w taki sposób, aby można było usunąć komentarze.
    // -----------------------------------------------------------------------------------------------------

    public double calculateBonus(Order order) {
        double bonus = 0.1;
        double priceLimit = 50;
            if (order.getTotalAmount().compareTo(BigDecimal.valueOf(1000)) > 0) {
                bonus = 0.2;
                priceLimit = 100;
            }
        return bonus * getExpensiveProductsSum(order, priceLimit);
    }

    private static double getExpensiveProductsSum(Order order, double priceLimit) {
        double expensiveProductsSum = 0.0;
            for (OrderItem item : order.getItems()) {
                Product product = item.getProduct();
                if (product.getPrice() > priceLimit) {
                    expensiveProductsSum += product.getPrice();
                }
            }
        return expensiveProductsSum;
    }

}
