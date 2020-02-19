package academy.everyonecodes.java.week9.set2.exercise1;

import java.util.Objects;

public class MoneyUnit {
    private double value;
    private String currency;

    public MoneyUnit(double value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoneyUnit unit = (MoneyUnit) o;
        return Double.compare(unit.value, value) == 0 &&
                Objects.equals(currency, unit.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, currency);
    }
}

