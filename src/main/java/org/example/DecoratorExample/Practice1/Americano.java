package org.example.DecoratorExample.Practice1;

public class Americano implements Coffee{
    @Override
    public String description() {
        return "Americano";
    }

    @Override
    public double price() {
        return 1.5;
    }
}
