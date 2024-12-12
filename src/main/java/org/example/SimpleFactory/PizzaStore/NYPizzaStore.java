package org.example.SimpleFactory.PizzaStore;

import org.example.SimpleFactory.NYPizza.NYCheesePizza;
import org.example.SimpleFactory.NYPizza.NYRegularPizza;
import org.example.SimpleFactory.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYCheesePizza();
            case "regular" -> new NYRegularPizza();
            default -> null;
        };
    }
}
