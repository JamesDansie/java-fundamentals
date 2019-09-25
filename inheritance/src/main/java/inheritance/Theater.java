package inheritance;

import java.util.LinkedList;

public class Theater extends Restaurant {

    LinkedList<String> movies;

    public Theater(String name, int price) {
        super(name, price);
    }

    public void addMovie(String movie){
        if(movies == null){
            movies = new LinkedList<>();
        }
        this.movies.add(movie);
    }

    public void removeMovie(String movie){
        if(movies == null){
            System.out.println("No movies left");
        } else {
        this.movies.remove(movie);
        }
    }

    public String showMovieList(){
        return movies.toString();
    }

    //adds a review to the head of the list
    public void addReviewHead(String name, String body, int stars, String movie){
        super.insertHeadReview(new Review(name, body, stars, movie));
        super.updateStars();
    }
}
