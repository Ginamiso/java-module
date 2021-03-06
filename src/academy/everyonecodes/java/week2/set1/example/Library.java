package academy.everyonecodes.java.week2.set1.example;

import java.util.List;

public class Library {
    private String name;
    private List<BookEntry> books;

    public Library(String name, List<BookEntry> books){
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public List<BookEntry> getBooks() {
        return books;
    }
}
