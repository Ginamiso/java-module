package academy.everyonecodes.java.week9.set2.exercise1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChangeUnitsCalculator {
    private List<MoneyUnit> units = EuroUnits.get();

    public List<MoneyUnit> calculate(Double change) {
        List<MoneyUnit> notes = new ArrayList<>();
        while (change > 0) {
            Optional<MoneyUnit> oUnit = getUnit(change);
            if (oUnit.isPresent()) {
                MoneyUnit unit = oUnit.get();
                notes.add(unit);
                change = subtract(change, unit);
            }

        }
        return notes;
    }

    private double subtract(Double change, MoneyUnit unit) {
        return BigDecimal.valueOf(change)
                .subtract(BigDecimal.valueOf(unit.getValue()))
                .doubleValue();
    }

    private Optional<MoneyUnit> getUnit(Double change){
            return units.stream()
                    .filter(unit -> unit.getValue() <= change)
                    .findFirst();
        }
    }






