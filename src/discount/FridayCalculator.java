package discount;

public class FridayCalculator implements DiscountStrategy {

    @Override
    public double getTotalDiscount(double totalprice) {

            return totalprice *.5;
    }
}
