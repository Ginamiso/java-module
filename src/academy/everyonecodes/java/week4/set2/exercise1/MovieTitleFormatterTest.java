package academy.everyonecodes.java.week4.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MovieTitleFormatterTest {
    MovieTitleFormatter movieTitleFormatter = new MovieTitleFormatter();

    @ParameterizedTest
    @CsvSource({
            "The Great Gatsby, the great gatsby",
            "Fear And Loathing In Las Vegas, fear and loathing in las vegas"

    })
    void format(String expected, String input){
        String result = movieTitleFormatter.format(input);

        Assertions.assertEquals(expected, result);
    }
}
