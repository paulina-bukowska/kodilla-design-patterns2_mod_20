package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class PeavaPizzaDecorator extends AbstractPizzaOrderDecorator {
    public PeavaPizzaDecorator(Pizza pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = super.getIngredients();
        ingredients.add("turkey breast");
        ingredients.add("cucumber");
        return ingredients;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(12));
    }
}
