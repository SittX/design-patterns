package org.example.DecoratorExample.Practice1;

public abstract class CoffeeDecorator implements Coffee{
    protected final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String description() {
        return coffee.description();
    }

    @Override
    public double price() {
        return coffee.price();
    }
}
