package academy.everyonecodes.java.evaluation1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AuthorEmailRetrieverTest {

    AuthorEmailRetriever emailRetriever = new AuthorEmailRetriever();

    @Test
    void retrieveEmail(){
        User gina = new User("gina@gmail.com", "1234%");
        Comment input = new Comment("Beautiful Cats", "I have a beautiful cat", gina);
        String result = emailRetriever.retrieve(input);
        String expected = "gina@gmail.com";

        Assertions.assertEquals(expected, result);
    }

}
