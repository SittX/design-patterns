package org.example.DecoratorPattern;

public class Americano implements Beverage{
    @Override
    public String description() {
        return "Americano coffee";
    }

    @Override
    public int cost() {
        return 5; // Base cost of Americano
    }
}
