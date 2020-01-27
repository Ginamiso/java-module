package academy.everyonecodes.java.week6.set1.exercise3;

import java.util.List;

public class PublisherPostCounter {
    public int count(Blog blog) {
        List<Post> posts = blog.getPosts();
        int result = 0;
        for(Post post : posts){
            if(post.isPublished()){
                result = result+1;
            }
        }return result;
    }
}
