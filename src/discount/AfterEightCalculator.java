package discount;

public class AfterEightCalculator implements DiscountStrategy {

    @Override
    public double getTotalDiscount(double totalprice) {
            return totalprice * 0;
    }
}
