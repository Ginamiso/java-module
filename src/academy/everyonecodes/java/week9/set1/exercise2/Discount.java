package academy.everyonecodes.java.week9.set1.exercise2;

import java.util.List;

public class Discount {
    private int discountPercentage;
    private List<String> applicableProductNames;

    public Discount(int discountPercentage, List<String> applicableProductNames) {
        this.discountPercentage = discountPercentage;
        this.applicableProductNames = applicableProductNames;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public List<String> getApplicableProductNames() {
        return applicableProductNames;
    }

    public double apply(List<Product> products) {
        return products.stream()
                .filter(product -> applicableProductNames.contains(product.getName()))
                .mapToDouble(product -> product.getPrice() * (discountPercentage / 100.0))
                .sum();
    }
}
