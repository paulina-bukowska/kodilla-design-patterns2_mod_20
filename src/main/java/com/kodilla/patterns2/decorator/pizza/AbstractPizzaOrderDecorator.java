package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public abstract class AbstractPizzaOrderDecorator implements Pizza {
    private final Pizza pizzaOrder;

    protected AbstractPizzaOrderDecorator(Pizza pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public List<String> getIngredients() {
        return pizzaOrder.getIngredients();
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }
}
