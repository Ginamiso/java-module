package academy.everyonecodes.java.week2.set2.examples.example2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SuggestionCollector {
    public List<MovieSuggestion> collect(List<Attendee> attendees){
        Scanner scanner = new Scanner((System.in));
        List<MovieSuggestion> suggestions = new ArrayList<>();
        for(Attendee attendee : attendees){
            System.out.println(attendee.getName()+", what is your suggestion");
            String movieTitle = scanner.nextLine();
            System.out.println("And what is the minimum age?");
            int minimumAge = scanner.nextInt();
            scanner.nextLine();
            MovieSuggestion suggestion = new MovieSuggestion(movieTitle, minimumAge);
            suggestions.add(suggestion);
        }
        return suggestions;
    }
}
