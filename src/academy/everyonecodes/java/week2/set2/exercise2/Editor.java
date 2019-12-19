package academy.everyonecodes.java.week2.set2.exercise2;

import academy.everyonecodes.java.week2.set2.exercise1.Article;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    public Magazine writeMagazine(){
        Article article1 = new Article("Cat", "Found a beautiful cat");
        Article article2 = new Article ("New Planet", "Found a new beautiful planet");
        Article article3 = new Article("Renata", "Renata winner of everyone codes academy");
        List<Article> articles = new ArrayList<>();
        articles.add(article1);
        articles.add(article2);
        articles.add(article3);
        Magazine magazine = new Magazine("Everyone Writes", articles);
        return magazine;

    }
}
