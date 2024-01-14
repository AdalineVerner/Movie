package ru.netology.javaqa;

public class Movie {
    private String title;
    private String imageUrl;
    private String genre;
    private String releaseMonth;
    private int releaseYear;
    private int releaseDate;

    public Movie(String title, String imageUrl, String genre,
                 String releaseMonth, int releaseYear, int releaseDate) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.genre = genre;
        this.releaseMonth = releaseMonth;
        this.releaseYear = releaseYear;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(String releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
