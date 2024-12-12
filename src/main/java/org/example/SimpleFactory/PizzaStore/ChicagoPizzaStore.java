package org.example.SimpleFactory.PizzaStore;

import org.example.SimpleFactory.ChicagoPizza.ChicagoCheesePizza;
import org.example.SimpleFactory.ChicagoPizza.ChicagoNormalPizza;
import org.example.SimpleFactory.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        return switch(type){
           case "cheese" -> new ChicagoCheesePizza();
           case "regular" -> new ChicagoNormalPizza();
           default -> null;
        };
    }
}
