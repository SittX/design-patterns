package org.example.FactoryPattern.Factory;


import org.example.FactoryPattern.Product.Cake;
import org.example.FactoryPattern.Product.IceCream;
import org.example.FactoryPattern.Product.Product;

public class RandomProductFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        System.out.println("Executing random factory method");
        long randomNumber = Math.round(Math.random() * 2);

        if(randomNumber > 1 && randomNumber < 10){
            return new IceCream();
        }else{
            return new Cake();
        }
    }
}
