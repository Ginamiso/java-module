package academy.everyonecodes.java.evaluation1.exercise1;

public class AuthorEmailRetriever {
    public String retrieve(Comment comment){
        User author = comment.getUser();
        String email = author.getEmail();
        return email;
    }
}
