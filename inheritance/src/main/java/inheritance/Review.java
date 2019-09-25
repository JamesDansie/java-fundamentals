package inheritance;

public class Review {
    String author;
    String body;
    int stars;
    String movie;

    public Review(String name, String body, int stars){
        this.author = name;
        this.body = body;
        this.stars = stars;
    }

    public Review(String name, String body, int stars, String movie){
        this.author = name;
        this.body = body;
        this.stars = stars;
        this.movie = movie;
    }

    @Override
    public String toString(){
        if(this.movie == null){
            return String.format("%s had this to say: %s. Their review had %s stars.",
                    this.author, this.body, this.stars);
        } else {
            return String.format("%s had this to say: %s. Their review had %s stars. They saw the movie %s.",
                    this.author, this.body, this.stars, this.movie);
        }

    }
}
