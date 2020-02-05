package academy.everyonecodes.java.week7.set2.exercise5;

import academy.everyonecodes.java.week5.set2.exercise4.HappinessRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class HappinessDataReaderTest {
    HappinessDataReader reader = new HappinessDataReader();

    @Test
    void test(){
        List<HappinessRecord> records = reader.read();
        int size = 155;
        Assertions.assertEquals(size, records.size());
        HappinessRecord result = records.get(0);
        HappinessRecord expectedFirst = new HappinessRecord("Lesotho", 139, 3.80800008773804);
        assertRecordEquals(expectedFirst, result);
        HappinessRecord expectedLast = new HappinessRecord("Ireland", 15, 6.97700023651123);
        HappinessRecord resultLast = records.get(records.size() - 1);
        assertRecordEquals(expectedLast, resultLast);
    }
    private void assertRecordEquals(HappinessRecord expected, HappinessRecord actual) {
        Assertions.assertEquals(expected.getCountry(), actual.getCountry());
        Assertions.assertEquals(expected.getRank(), actual.getRank());
        Assertions.assertEquals(expected.getScore(), actual.getScore());
    }
}
