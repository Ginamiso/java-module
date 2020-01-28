package academy.everyonecodes.java.week6.set1.exercise4;

import academy.everyonecodes.java.week6.set1.exercise3.Blog;
import academy.everyonecodes.java.week6.set1.exercise3.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class BlogCheckerTest {

    BlogChecker blogChecker = new BlogChecker();

    @Test
    void hasBlog(){
        Date date = new Date(3, 4, 2020);
        Blog blog = new Blog ("This Blog", List.of(), date);
        Website input = new Website("www.blabla.com", "chachacha", Optional.of(blog));
        boolean result = blogChecker.hasBlog(input);

        Assertions.assertTrue(result);
    }
    @Test
    void hasBlogCornerCase(){

        Website input = new Website("www.blabla.com", "chachacha", Optional.empty());
        boolean result = blogChecker.hasBlog(input);

        Assertions.assertFalse(result);
    }
}
