package academy.everyonecodes.java.optionals.enums.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.DayOfWeek;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class DrawerTest {
    Drawer drawer = new Drawer();

    @Test
    void getOutfitForToday() {
        Month month = Month.SEPTEMBER;
        DayOfWeek day = DayOfWeek.MONDAY;
        Outfit result = drawer.getOutfitForToday(month, day);
        Outfit expected = new Outfit(Socks.REDSOCKS, HeadPiece.HAT);

        Assertions.assertEquals(expected, result);
    }
    }

