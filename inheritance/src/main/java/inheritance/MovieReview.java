package inheritance;

public class MovieReview {
    String author;
    String body;
    int stars;
    String movie;

    public MovieReview(String name, String body, int stars, String movie){
        this.author = name;
        this.body = body;
        this.stars = stars;
        this.movie = movie;
    }

    @Override
    public String toString(){
        return String.format("%s had this to say: %s. Their review had %s stars. They saw the movie %s.",
                this.author, this.body, this.stars, this.movie);
    }
}
