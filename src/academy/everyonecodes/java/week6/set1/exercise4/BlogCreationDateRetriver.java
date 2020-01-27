package academy.everyonecodes.java.week6.set1.exercise4;

import academy.everyonecodes.java.week6.set1.exercise3.Blog;
import academy.everyonecodes.java.week6.set1.exercise3.Date;

import java.util.Optional;

public class BlogCreationDateRetriver {
    public Optional<Date> retrieve(Website website) {
        Optional<Blog> oBlog = website.getBlog();
        if (oBlog.isPresent()) {
            Blog blog = oBlog.get();
            Date date = blog.getDateCreated();
            return Optional.of(date);
        }
        return Optional.empty();
    }
}
