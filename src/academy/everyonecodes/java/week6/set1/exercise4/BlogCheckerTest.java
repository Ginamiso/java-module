package academy.everyonecodes.java.week6.set1.exercise4;

import academy.everyonecodes.java.week6.set1.exercise3.Blog;
import academy.everyonecodes.java.week6.set1.exercise3.Date;
import academy.everyonecodes.java.week6.set1.exercise3.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class BlogCheckerTest {

    BlogChecker blogChecker = new BlogChecker();

    @Test
    void hasBlog(){
        Date dateOfBlog = new Date(3, 4, 2020);
        Date dateOfPost = new Date(2, 1, 2020);
        Post post1 = new Post("This post", "amazing", dateOfPost, false);
        Post post2 = new Post("other Post", "wow", dateOfPost, true);
        Blog blog = new Blog ("This Blog", List.of(post1, post2), dateOfBlog);
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
