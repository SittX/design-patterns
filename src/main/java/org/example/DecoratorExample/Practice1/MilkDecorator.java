package org.example.DecoratorExample.Practice1;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double price() {
        return super.price() + 0.5;
    }

    @Override
    public String description() {
        return super.description() + " + milk";
    }
}
