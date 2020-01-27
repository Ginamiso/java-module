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
        Date dateOfBlog = new Date(3, 4, 2020);
        Date dateOfPost = new Date(2, 1, 2020);
        Post post1 = new Post("This post", "amazing", dateOfPost, false);
        Post post2 = new Post("other Post", "wow", dateOfPost, true);
        Blog blog = new Blog ("This Blog", List.of(post1, post2), dateOfBlog);
        Website input = new Website("www.blabla.com", "chachacha", Optional.of(blog));

        Optional<Date> result = blogCreationDateRetriver.retrieve(input);
        Date expected = new Date(3, 4, 2020);
        Assertions.assertEquals(expected.getDay(), result.get().getDay());
        Assertions.assertEquals(expected.getMonth(), result.get().getMonth());
        Assertions.assertEquals(expected.getYear(), result.get().getYear());
    }
    @Test
    void retrieveEmptyOptional(){

        Website input = new Website("www.blabla.com", "chachacha", Optional.empty());

        Optional<Date> result = blogCreationDateRetriver.retrieve(input);


        Assertions.assertTrue(result.isEmpty());

    }
}
