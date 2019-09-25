package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {
    Theater brewvies;

    @Before
    public void setUp(){
        brewvies = new Theater("Brewvies", 2);
        brewvies.addMovie("John Wick");
        brewvies.addMovie("Midnight in Paris");
        brewvies.addReviewHead("James", "Best theater in SLC!", 5);
        brewvies.addReviewHead("Jon", "It's alright.", 4, "Blade Runner");
    }

    @Test
    public void addReviewHead() {
        assertEquals("The head reviewer should be jon",
                "Jon",
                brewvies.head.data.author);
    }

    @Test
    public void addReviewHeadFail() {
        assertNotEquals("The head reviewer should be jon, not james",
                "James",
                brewvies.head.data.author);
    }

    @Test
    public void testToString() {
        assertEquals("The theather should have 4.5 stars and 2 price",
                "Brewvies has 4.5 stars and $2 price.",
                brewvies.toString());
    }
    @Test
    public void testToStringFail() {
        brewvies.addReviewHead("Bizzaro Jon", "Why did I see this movie? What was I thinking? I will ponder my life choices.", 1, "The Bronies");
        assertNotEquals("The theather should not have 4.5 stars and 2 price",
                "Brewvies has 4.5 stars and $2 price.",
                brewvies.toString());
    }

    @Test
    public void reviewsReturn() {
        assertEquals("Should have two reviews from Jon and James. One with a movie, one without",
                "Jon had this to say: It's alright.. Their review had 4 stars. They saw the movie Blade Runner.\n" +
                        "James had this to say: Best theater in SLC!. Their review had 5 stars.",
                brewvies.reviewsReturn());
    }

    @Test
    public void reviewsReturnNot() {
        assertNotEquals("Should have two reviews from Jon and James. One with a movie, one without",
                "Jon had this to say: It's alright.. Their review had 4 stars. They saw the movie Blade Runner.\n",
                brewvies.reviewsReturn());
    }

    @Test
    public void addMovie() {
        assertEquals("Should have the movies: John Wick, and Midnight in Paris",
                "[John Wick, Midnight in Paris]",
                brewvies.showMovieList());
    }

    @Test
    public void removeMovie() {
        brewvies.removeMovie("John Wick");
        assertEquals("Should have the movies: John Wick, and Midnight in Paris",
                "[Midnight in Paris]",
                brewvies.showMovieList());
    }
}