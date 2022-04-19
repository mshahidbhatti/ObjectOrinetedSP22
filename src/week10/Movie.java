package week10;

import java.util.Comparator;

public class Movie implements Comparator<Movie> {
    private String title;
    private int rating;
    private int yearOfRelease;

    public Movie(String title, int rating, int yearOfRelease) {
        this.title = title;
        this.rating = rating;
        this.yearOfRelease = yearOfRelease;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }

    @Override
    public int compare(Movie o1, Movie o2) {
        if(o1.rating==o2.rating)
            return 0;
        return o1.rating>o2.rating?1:-1;
    }

    @Override
    public boolean equals(Object o){
        Movie m=(Movie) o;
        return this.getTitle().equals(m.getTitle());
    }
}
