package inheritance;

import java.util.LinkedList;

public class Theater extends Restaurant {

    LinkedList<String> movies;

    public Theater(String name, int price) {
        super(name, price);
    }

    public void addMovie(String movie){
        this.movies.add(movie);
    }

    public void removeMovie(String movie){
        this.movies.remove(movie);
    }

    public String movieList(){
        return movies.toString();
    }

    //adds a review to the head of the list
    public void addReviewHead(String name, String body, int stars, String movie){
        super.insertHeadReview(new Review(name, body, stars, movie));
        super.updateStars();
    }
}
