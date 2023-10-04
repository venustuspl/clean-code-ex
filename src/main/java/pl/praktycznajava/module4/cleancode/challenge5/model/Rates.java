package pl.praktycznajava.module4.cleancode.challenge5.model;

import java.util.List;

public class Rates {

    List<Rate> rates;

    public void calculateDiscount(Product product) {
        double discountPercentage = this.getPercentageDiscountBy(product.getType(), product.getPrice());
        product.addDiscount(product.getPrice().getByPercentage(discountPercentage));
    }

    public double getPercentageDiscountBy(String type, Price price) {
        // FIXME nieskończona implementacja
        return 10;
    }
}
