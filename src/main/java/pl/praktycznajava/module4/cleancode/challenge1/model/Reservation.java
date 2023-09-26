package pl.praktycznajava.module4.cleancode.challenge1.model;

// FIXME nieskończona implementacja
public class Reservation {
    public int getNumberOfDays() {
        return 3;
    }

    public void calculatePrice() {
        // jeśli liczba dni rezerwacji jest większa niż 4 to naliczona jest zniżka - komentarz do usunięcia
        if (this.getNumberOfDays() > 4) {
            // todo
        }
    }
}
