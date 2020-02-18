package academy.everyonecodes.java.week9.set1.exercise2;

import java.util.List;

public class TotalDiscountCalculator {
    private List<Discount> discounts = Discounts.get();

    public double calculate(List<Product> products) {
        double totalDiscount = discounts.stream()
                .map(discount -> discount.apply(products))
                .reduce(0.0, Double::sum);

        double totalPrice = products.stream()
                .map(Product::getPrice)
                .reduce(0.0, Double::sum);

        return totalPrice - totalDiscount;
    }
}
