package academy.everyonecodes.java.week8.extraExercises.exercise2;

import academy.everyonecodes.java.gitIgnore.week5.set2.exercise5.GotDataReader;

import java.util.*;

public class BookWithMostDeaths {
    GotDataReader reader = new GotDataReader();
    public String count(){
        long firstBook = reader.read().stream()
                .filter(book-> book.getBookOfDeath().isPresent())
                .map(book-> book.getBookOfDeath().get())
                .filter(book -> book.equals("1"))
                .count();
        long secondBook = reader.read().stream()
                .filter(book-> book.getBookOfDeath().isPresent())
                .map(book-> book.getBookOfDeath().get())
                .filter(book -> book.equals("2"))
                .count();
        long thirdBook = reader.read().stream()
                .filter(book-> book.getBookOfDeath().isPresent())
                .map(book-> book.getBookOfDeath().get())
                .filter(book -> book.equals("3"))
                .count();
        long fourthBook = reader.read().stream()
                .filter(book-> book.getBookOfDeath().isPresent())
                .map(book-> book.getBookOfDeath().get())
                .filter(book -> book.equals("4"))
                .count();
        long fifthBook = reader.read().stream()
                .filter(book-> book.getBookOfDeath().isPresent())
                .map(book-> book.getBookOfDeath().get())
                .filter(book -> book.equals("5"))
                .count();
        Map<String, Long> booksOfDeath = Map.of("1", firstBook, "2", secondBook, "3", thirdBook, "4", fourthBook, "5", fifthBook);
        Map.Entry<String, Long> bookWithMostDeaths = booksOfDeath.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .findFirst().get();
        return "Book number "+bookWithMostDeaths.getKey()+" with "+bookWithMostDeaths.getValue()+" deaths.";
    }
}
