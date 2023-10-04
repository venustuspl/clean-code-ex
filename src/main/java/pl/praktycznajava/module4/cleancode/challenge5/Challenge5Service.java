package pl.praktycznajava.module4.cleancode.challenge5;

import lombok.AllArgsConstructor;
import pl.praktycznajava.module4.cleancode.challenge5.model.*;
import pl.praktycznajava.module4.cleancode.challenge5.service.ConfirmationService;

@AllArgsConstructor
public class Challenge5Service {

    // ---------------------------------------------------------------------------------------------------
    // Challenge 5. Zrefaktoryzuj ciała dwóch poniższych metod w taki sposób, aby były jasne i czytelne.
    //              Zwróć uwagę, aby ta metoda nie korzystała z argumentów wyjściowych.
    // --------------------------------------------------------------------------------------------

    private final ConfirmationService confirmationService;

    public Order processOrder(Order order, Product product, Rates rates) {
        rates.calculateDiscount(product);
        return confirmationService.confirm(order);// confirm wyliczy sobie totalPrice
    }

}
