package org.example.DecoratorPattern;

public class MilkDecorator extends CondimentDecorator{
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + ", milk";
    }

    @Override
    public int cost() {
        return beverage.cost() + 10;
    }
}
