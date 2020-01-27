package academy.everyonecodes.java.week6.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PublisherPostCounterTest {
    PublisherPostCounter publisherPostCounter = new PublisherPostCounter();

    @Test
    void countFirstBlog(){
        Date dateOfBlog = new Date(3, 4, 2020);
        Date dateOfPost = new Date(2, 1, 2020);
        Post post1 = new Post("This post", "amazing", dateOfPost, true);
        Post post2 = new Post("other Post", "wow", dateOfPost, true);
        Blog input = new Blog ("This Blog", List.of(post1, post2), dateOfBlog);

        int result = publisherPostCounter.count(input);

        Assertions.assertEquals(2, result);

    }
    @Test
    void countSecondBlog(){
        Date dateOfBlog = new Date(3, 4, 2020);
        Date dateOfPost = new Date(2, 1, 2020);
        Post post1 = new Post("This post", "amazing", dateOfPost, false);
        Post post2 = new Post("other Post", "wow", dateOfPost, true);
        Blog input = new Blog ("This Blog", List.of(post1, post2), dateOfBlog);

        int result = publisherPostCounter.count(input);

        Assertions.assertEquals(1, result);

    }
    @Test
    void count(){
        Date dateOfBlog = new Date(3, 4, 2020);

        Blog input = new Blog ("This Blog", List.of(), dateOfBlog);

        int result = publisherPostCounter.count(input);

        Assertions.assertEquals(0, result);

    }
}
