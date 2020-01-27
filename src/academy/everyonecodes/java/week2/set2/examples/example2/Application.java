package academy.everyonecodes.java.week2.set2.examples.example2;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        AttendeeCollector collector = new AttendeeCollector();
        SuggestionCollector suggestionCollector = new SuggestionCollector();
        MovieSelector selector = new MovieSelector();
        List<Attendee> attendees = collector.collect();
        List<MovieSuggestion> suggestions = suggestionCollector.collect(attendees);
        MovieSuggestion movie = selector.select(attendees, suggestions);
        System.out.println(movie.getMovieTitle());

    }
}
