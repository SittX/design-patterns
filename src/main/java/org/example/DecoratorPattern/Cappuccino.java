package org.example.DecoratorPattern;

public class Cappuccino implements Beverage{
    @Override
    public String description() {
        return "Cappuccino coffee";
    }

    @Override
    public int cost() {
        return 6;
    }
}
