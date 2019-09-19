package discount;

import com.company.ShoppingCart;

public class DiscountContext {
    private DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double getTotalDiscount(double totalprice) {
        return strategy.getTotalDiscount(totalprice);
    }

}
