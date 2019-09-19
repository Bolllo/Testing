package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class ShoppingCart {

    private ArrayList<Product> _products;

    public ShoppingCart() {
        this._products = new ArrayList<>();
    }

    public void AddToCart(Product product){
        _products.add(product);
    }

    public Product[] getAll(){
        int size = this._products.size();
        return this._products.toArray(new Product[size]);
    }

}
