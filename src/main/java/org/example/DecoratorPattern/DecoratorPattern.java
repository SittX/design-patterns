package org.example.DecoratorPattern;

public class DecoratorPattern {
    public static void main(String[] args) {
        Beverage coffee = new MochaDecorator(new MilkDecorator(new MilkDecorator(new Americano())));
        System.out.println(coffee.description());
        System.out.println("Total price : " + coffee.cost());
    }
}
