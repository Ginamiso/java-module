package academy.everyonecodes.java.week7.set2.googlePlayStore;

import java.util.List;

public class GoogleParser {
    public GooglePlay parse(String line){
        List<String> lines = List.of(line.split(","));
        String app = lines.get(0);
        String category = lines.get(1);
        double rating = Double.parseDouble(lines.get(2));
        int review = Integer.parseInt(lines.get(3));
        String size = lines.get(4);
        String install = lines.get(5);
        String type = lines.get(6);
        int price = Integer.parseInt(lines.get(7));
        String content= lines.get(8);
        String genres = lines.get(9);
        String lastUpdate = lines.get(10);
        String currentVer = lines.get(11);
        String androidVer = lines.get(12);

        return new GooglePlay(app, category, rating, review, size, install,type, price,
                content, genres, lastUpdate, currentVer, androidVer);
    }
}
