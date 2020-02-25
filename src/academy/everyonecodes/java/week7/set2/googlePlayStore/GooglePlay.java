package academy.everyonecodes.java.week7.set2.googlePlayStore;

import java.util.Objects;

public class GooglePlay {
    private String app;
    private String category;
    private double rating;
    private int reviews;
    private String size;
    private String installs;
    private String type;
    private int price;
    private String content;
    private String genres;
    private String lastUpdate;
    private String currentVer;
    private String androidVer;

    public GooglePlay(String app, String category, double rating, int reviews, String size, String installs, String type, int price, String content, String genres, String lastUpdate, String currentVer, String androidVer) {
        this.app = app;
        this.category = category;
        this.rating = rating;
        this.reviews = reviews;
        this.size = size;
        this.installs = installs;
        this.type = type;
        this.price = price;
        this.content = content;
        this.genres = genres;
        this.lastUpdate = lastUpdate;
        this.currentVer = currentVer;
        this.androidVer = androidVer;
    }


    public String getApp() {
        return app;
    }

    public String getCategory() {
        return category;
    }

    public double getRating() {
        return rating;
    }

    public int getReviews() {
        return reviews;
    }

    public String getSize() {
        return size;
    }

    public String getInstalls() {
        return installs;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getContent() {
        return content;
    }


    public String getGenres() {
        return genres;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public String getCurrentVer() {
        return currentVer;
    }

    public String getAndroidVer() {
        return androidVer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GooglePlay that = (GooglePlay) o;
        return Double.compare(that.rating, rating) == 0 &&
                reviews == that.reviews &&
                price == that.price &&
                Objects.equals(app, that.app) &&
                Objects.equals(category, that.category) &&
                Objects.equals(size, that.size) &&
                Objects.equals(installs, that.installs) &&
                Objects.equals(type, that.type) &&
                Objects.equals(content, that.content) &&
                Objects.equals(genres, that.genres) &&
                Objects.equals(lastUpdate, that.lastUpdate) &&
                Objects.equals(currentVer, that.currentVer) &&
                Objects.equals(androidVer, that.androidVer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(app, category, rating, reviews, size, installs, type, price, content, genres, lastUpdate, currentVer, androidVer);
    }
}
