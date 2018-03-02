package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class SkinnyDoughtDecorator extends AbstractPizzaOrderDecorator {
    public SkinnyDoughtDecorator(Pizza pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = super.getIngredients();
        ingredients.remove("original dough");
        ingredients.add("skinny dough");
        return ingredients;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1));
    }
}
