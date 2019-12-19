package academy.everyonecodes.java.week2.set2.exercise1;

public class Application {
    public static void main(String[] args) {
        Article article = new Article("Cat stuck on a tree","A cat got stuck on a tree :(");
        Printer printer = new Printer();
        printer.print(article);
    }
}
