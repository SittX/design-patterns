package org.example.FactoryPattern;

import org.example.FactoryPattern.Factory.FirstProductFactory;
import org.example.FactoryPattern.Factory.ProductFactory;
import org.example.FactoryPattern.Factory.RandomProductFactory;
import org.example.FactoryPattern.Product.Product;

import java.io.*;
import java.util.Scanner;

public class FactoryMethodPattern {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String userInput = reader.readLine();

        ProductFactory productFactory;
        if(userInput.equalsIgnoreCase("random")){
            productFactory = new RandomProductFactory();
        }else{
            productFactory = new FirstProductFactory();
        }

        Product resultingProduct = productFactory.createProduct();
        String productDetails = resultingProduct.getProductDetails();
        System.out.printf("Product details: %s%n", productDetails);
    }
}
