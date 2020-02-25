package academy.everyonecodes.java.week7.set2.googlePlayStore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GoogleParserTest {
    GoogleParser parser = new GoogleParser();

    @ParameterizedTest
    @MethodSource("parameters")
    void parse(GooglePlay expected, String input) {
        GooglePlay result = parser.parse(input);
        Assertions.assertEquals(expected, result);
    }
    private static Stream<Arguments> parameters(){
        return Stream.of(
                Arguments.of(new GooglePlay("Mandala Coloring Book","ART_AND_DESIGN",4.6,4326,"21M","100,000+","Free",0,"Everyone","Art & Design","June 26, 2018","1.0.4","4.4 and up"),
        "Mandala Coloring Book,ART_AND_DESIGN,4.6,4326,21M,100,000+,Free,0,Everyone,Art & Design,June 26, 2018,1.0.4,4.4 and up")
        );
    }
}