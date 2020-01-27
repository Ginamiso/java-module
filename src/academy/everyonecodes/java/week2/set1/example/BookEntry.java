package academy.everyonecodes.java.week2.set1.example;

public class BookEntry {
    private String title;
    private String author;
    private int date;

    public BookEntry(String title, String author, int date){
        this.title = title;
        this.author = author;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
