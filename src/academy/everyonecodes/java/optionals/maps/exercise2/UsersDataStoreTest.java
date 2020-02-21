package academy.everyonecodes.java.optionals.maps.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

class UsersDataStoreTest {
    UsersDataStore dataStore = new UsersDataStore();
    @ParameterizedTest
    @MethodSource("parameters")
    void getUserByUsername(Optional<User> oExpected, String input){
        Optional<User> oResult = dataStore.getUserByUsername(input);
        Assertions.assertEquals(oExpected, oResult);
    }
    private static Stream<Arguments> parameters(){
        User gina = new User("Gina", "lalala");
        return Stream.of(
                Arguments.of(Optional.of(gina), "Gina"),
                Arguments.of(Optional.empty(), "Gino"),
                Arguments.of(Optional.empty(), "")
        );
    }
}
