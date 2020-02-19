package academy.everyonecodes.java.week9.set2.exercise2;

import academy.everyonecodes.java.week9.set2.exercise2.Moves.Move;
import academy.everyonecodes.java.week9.set2.exercise2.Moves.Paper;
import academy.everyonecodes.java.week9.set2.exercise2.Moves.Rock;
import academy.everyonecodes.java.week9.set2.exercise2.Moves.Scissors;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecisionMakerTest {

    DecisionMaker decisionMaker = new DecisionMaker();

    @ParameterizedTest
    @MethodSource("parameters")
    void decide(String expected, Move move1, Move move2) {
        String result = decisionMaker.decide(move1, move2);

        assertEquals(expected, result);
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("Nobody wins", new Rock(), new Rock()),
                Arguments.of("Nobody wins", new Scissors(), new Scissors()),
                Arguments.of("Nobody wins", new Paper(), new Paper()),
                Arguments.of("Player 1 wins", new Rock(), new Scissors()),
                Arguments.of("Player 1 wins", new Scissors(), new Paper()),
                Arguments.of("Player 1 wins", new Paper(), new Rock()),
                Arguments.of("Player 2 wins", new Rock(), new Paper()),
                Arguments.of("Player 2 wins", new Scissors(), new Rock()),
                Arguments.of("Player 2 wins", new Paper(), new Scissors())
        );
    }
}