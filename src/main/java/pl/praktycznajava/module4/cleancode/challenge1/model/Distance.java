package pl.praktycznajava.module4.cleancode.challenge1.model;

import lombok.Getter;

@Getter
public class Distance {

    private final double kilometers;

    public Distance(double kilometers) {
        this.kilometers = kilometers;
    }

    public static Distance ofMiles(double miles){
        return new Distance(miles * 1.6093f);
    }
}
