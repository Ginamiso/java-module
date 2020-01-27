package academy.everyonecodes.java.week2.set1.example;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        BookEntry book1 = new BookEntry("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997);
        BookEntry book2 = new BookEntry("lalal", "blala", 1999);
        BookEntry book3 = new BookEntry("chachacha", "Mr.Robot", 2000);
        List<BookEntry> books = List.of(book1, book2, book3);

        Library library = new Library("everyone reads", books);
        book2.setDate(2002);
        System.out.println(book2.getDate());

        for(BookEntry bookEntry: library.getBooks()){
            System.out.println("'"+ bookEntry.getTitle()+"' was authored by "+ bookEntry.getAuthor());
        }
    }
}
