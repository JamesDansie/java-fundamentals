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
}
