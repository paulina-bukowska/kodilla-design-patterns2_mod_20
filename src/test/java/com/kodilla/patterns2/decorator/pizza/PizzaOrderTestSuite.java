package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        Pizza theOrder = new BasicPizza();

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testBasicPizzaOrderGetIngredients() {
        //Given
        Pizza theOrder = new BasicPizza();

        //When
        List<String> ingredients = theOrder.getIngredients();

        //Then
        Assert.assertEquals(3, ingredients.size());
        Assert.assertTrue(ingredients.contains("original dough"));
        Assert.assertTrue(ingredients.contains("cheese"));
        Assert.assertTrue(ingredients.contains("toamato sauce"));
    }

    @Test
    public void testRendovaPizzaExtraCheeseCreamyDressing() {
        //Given
        Pizza theOrder = new BasicPizza();
        theOrder = new RendovaPizzaDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new CreamyDressingDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        List<String> ingredients = theOrder.getIngredients();

        //Then
        Assert.assertEquals(new BigDecimal(29), theCost);
        Assert.assertTrue(ingredients.contains("onion"));
        Assert.assertEquals(7, ingredients.size());
    }

    @Test
    public void testNoroPizzaExtraHamSkinnyDought() {
        //Given
        Pizza theOrder = new BasicPizza();
        theOrder = new NoroPizzaDecorator(theOrder);
        theOrder = new ExtraHamDecorator(theOrder);
        theOrder = new SkinnyDoughtDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        List<String> ingredients = theOrder.getIngredients();

        //Then
        Assert.assertEquals(new BigDecimal(28), theCost);
        Assert.assertFalse(ingredients.contains("original dough"));
        Assert.assertEquals(6, ingredients.size());
    }

    @Test
    public void testPeavaPizzaMozarellaDoubleCreamyDressing() {
        //Given
        Pizza theOrder = new BasicPizza();
        theOrder = new PeavaPizzaDecorator(theOrder);
        theOrder = new MozzarellaDecorator(theOrder);
        theOrder = new CreamyDressingDecorator(theOrder);
        theOrder = new CreamyDressingDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        List<String> ingredients = theOrder.getIngredients();

        //Then
        Assert.assertEquals(new BigDecimal(34), theCost);
        Assert.assertTrue(ingredients.contains("cucumber"));
        Assert.assertEquals(8, ingredients.size());
    }
}
