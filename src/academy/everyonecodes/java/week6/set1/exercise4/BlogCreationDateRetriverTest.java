package academy.everyonecodes.java.week6.set1.exercise4;

import academy.everyonecodes.java.week6.set1.exercise3.Blog;
import academy.everyonecodes.java.week6.set1.exercise3.Date;
import academy.everyonecodes.java.week6.set1.exercise3.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class BlogCreationDateRetriverTest {
    BlogCreationDateRetriver blogCreationDateRetriver = new BlogCreationDateRetriver();

    @Test
    void retrieve(){
        Date date = new Date(3, 4, 2020);
        Blog blog = new Blog ("This Blog", List.of(), date);
        Website input = new Website("www.blabla.com", "chachacha", Optional.of(blog));

        Optional<Date> oResult = blogCreationDateRetriver.retrieve(input);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(date, oResult.get());

    }
    @Test
    void retrieveEmptyOptional(){

        Website input = new Website("www.blabla.com", "chachacha", Optional.empty());

        Optional<Date> oResult = blogCreationDateRetriver.retrieve(input);


        Assertions.assertTrue(oResult.isEmpty());

    }
}
