package org.meals;

import java.math.BigDecimal;

public class PolishMeal implements Meal {

    private final String name;
    private final BigDecimal price;

    public PolishMeal(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
