package academy.everyonecodes.java.week2.set2.examples.example2;

public class MovieSuggestion {
    private String movieTitle;
    private int minimumAge;

    public MovieSuggestion(String movieTitle, int minimumAge){
        this.movieTitle = movieTitle;
        this.minimumAge = minimumAge;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public int getMinimumAge() {
        return minimumAge;
    }
}
