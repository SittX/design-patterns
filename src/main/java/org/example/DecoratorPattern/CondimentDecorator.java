package org.example.DecoratorPattern;

public abstract class CondimentDecorator implements Beverage {
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description();
    }

    @Override
    public int cost() {
        return beverage.cost();
    }
}
