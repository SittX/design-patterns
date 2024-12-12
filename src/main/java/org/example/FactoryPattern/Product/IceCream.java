package org.example.FactoryPattern.Product;

public class IceCream implements Product{
    @Override
    public String getProductDetails() {
        return "Ice cream as a product";
    }
}
