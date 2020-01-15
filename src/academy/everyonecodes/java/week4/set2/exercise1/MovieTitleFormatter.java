package academy.everyonecodes.java.week4.set2.exercise1;

import java.util.List;

public class MovieTitleFormatter {
    public String format(String movieTitle) {
        List<String> movies = List.of(movieTitle.split(" "));
        StringCapitalizer stringCapitalizer = new StringCapitalizer();
        String movieCapitalized = "";
        for(String word : movies){
            word = stringCapitalizer.capitalize(word);
            movieCapitalized = movieCapitalized + word+" ";
        }
        movieCapitalized = movieCapitalized.trim();

        return movieCapitalized;
    }
}
