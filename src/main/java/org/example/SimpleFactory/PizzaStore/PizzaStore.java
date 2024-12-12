package org.example.SimpleFactory.PizzaStore;

import org.example.SimpleFactory.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.pack();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
