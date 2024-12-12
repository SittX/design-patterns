package org.example.DecoratorExample.Practice1;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new IceDecorator(new MilkDecorator(new Americano()));
        System.out.println(coffee.description());
        System.out.println("Total : " + coffee.price());
    }
}
