package com.company;

public class TotalPriceCalculator {

    public double TotalPriceCalculator(ShoppingCart cart){

        double totalProductPrice = 0;
        for (Product p : cart.getAll())
            totalProductPrice += p.getPrice();

        return totalProductPrice;
    }


}
