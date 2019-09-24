package inheritance;

public class Review {
    String author;
    String body;
    int stars;

    public Review(String name, String body, int stars){
        this.author = name;
        this.body = body;
        this.stars = stars;
    }

    public String toString(){
        return String.format("%s had this to say: %s. Their review had %s stars.",
                this.author, this.body, this.stars);
    }
}
