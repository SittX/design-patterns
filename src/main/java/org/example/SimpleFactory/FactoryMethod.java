package org.example.SimpleFactory;

import org.example.SimpleFactory.PizzaStore.ChicagoPizzaStore;
import org.example.SimpleFactory.PizzaStore.NYPizzaStore;
import org.example.SimpleFactory.PizzaStore.PizzaStore;

public class FactoryMethod {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");

        PizzaStore pizzaStore1 = new ChicagoPizzaStore();
        Pizza normalPizza = pizzaStore1.orderPizza("regular");
    }
}
