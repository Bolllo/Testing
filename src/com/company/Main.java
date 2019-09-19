package com.company;

import discount.AfterEightCalculator;
import discount.DiscountContext;
import discount.DiscountStrategy;
import discount.FridayCalculator;

public class Main {

    public static void main(String[] args) {

        // logic
        // on friday the whole day 50% off
        boolean isFriday = true;
        // no discounts after 8
        boolean isAfterEight = false;


        // products
        //butter 1.00
        Product butter = new Butter(1.00);
        //apple syrup 2.00
        Product appleSyrup = new AppleSyrup(2.00);

        //shopping cart
        ShoppingCart cart = new ShoppingCart();
        cart.AddToCart(butter);
        cart.AddToCart(appleSyrup);


        // Calculator for Total Price

        TotalPriceCalculator totalcalc = new TotalPriceCalculator();

        double totalprice = totalcalc.TotalPriceCalculator(cart);


        // Calculator for discount
        DiscountContext dtx = new DiscountContext();

        if (isFriday) {
            dtx.setStrategy(new FridayCalculator());
        }
        if (isAfterEight) {
            dtx.setStrategy(new AfterEightCalculator());
        }

        double discount = dtx.getTotalDiscount(totalprice);
        System.out.println("Total Discount " + discount);

    }
}
