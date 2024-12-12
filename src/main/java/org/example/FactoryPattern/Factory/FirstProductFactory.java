package org.example.FactoryPattern.Factory;

import org.example.FactoryPattern.Product.IceCream;
import org.example.FactoryPattern.Product.Product;

public class FirstProductFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        System.out.println("Creating First product factory method");
        return new IceCream();
    }
}
