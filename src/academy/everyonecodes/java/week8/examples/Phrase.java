package academy.everyonecodes.java.week8.examples;

import java.util.Objects;

public class Phrase {
    private String text;
    private String author;

    public Phrase(String text, String author) {
        this.text = text;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phrase phrase = (Phrase) o;
        return Objects.equals(text, phrase.text) &&
                Objects.equals(author, phrase.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, author);
    }
}
