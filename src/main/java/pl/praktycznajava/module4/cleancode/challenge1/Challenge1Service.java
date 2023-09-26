package pl.praktycznajava.module4.cleancode.challenge1;

import pl.praktycznajava.module4.cleancode.challenge1.model.*;

public class Challenge1Service {

    // -------------------------------------------------------------------------------------------------------
    // Challenge 1. Zrefaktoryzuj ciała poniższych metod w taki sposób, aby były jasne i czytelne.
    //              Wykorzystaj statyczne metody fabryczne. A także odpowiednio wydziel metody i stałe.
    // -------------------------------------------------------------------------------------------------------

    public void checkDistanceOfMiles(double miles) {
        Distance distance = Distance.ofMiles(miles);

        // dalsze instrukcje
    }

    public void checkDistanceOfKilometers(double kilometers) {
        Distance distance = new Distance(kilometers);

        // dalsze instrukcje
    }
}
