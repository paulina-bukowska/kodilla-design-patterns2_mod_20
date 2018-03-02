package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class CreamyDressingDecorator extends AbstractPizzaOrderDecorator {
    public CreamyDressingDecorator(Pizza pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = super.getIngredients();
        ingredients.add("creamy caesar dressing");
        return ingredients;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }
}
