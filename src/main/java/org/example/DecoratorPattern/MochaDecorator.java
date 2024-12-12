package org.example.DecoratorPattern;

public class MochaDecorator extends CondimentDecorator{
    public MochaDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + ", mocha";
    }

    @Override
    public int cost() {
        return beverage.cost() + 2;
    }
}
