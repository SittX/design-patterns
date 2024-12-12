package org.example.DecoratorExample.Practice1;

public class IceDecorator extends CoffeeDecorator{
    public IceDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return super.description() + " + ice";
    }

    @Override
    public double price() {
        return super.price() + .0025;
    }
}
