package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BasicPizza implements Pizza {
    private List<String> ingredients = new ArrayList<>();

    @Override
    public List<String> getIngredients() {
        ingredients.add("original dough");
        ingredients.add("cheese");
        ingredients.add("toamato sauce");
        return ingredients;
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }
}