package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
    Restaurant noms;

    @Before
    public void setup(){
        noms = new Restaurant("Nom Shack", 2);
        noms.addReviewHead("Pat", "blah blah blah", 5);
        noms.addReviewHead("Bob", "yackidy yack", 4);
    }

    @Test
    public void testRestaurantCreation_addReview_toString() {
        assertEquals(
                "This should return the Nom Shack with 4.5 stars and 2 price",
                "Nom Shack has 4.5 stars and $2 price.",
                noms.toString());
    }

    @Test
    public void testRestaurantCreation_addReview_toString_False() {
        noms.addReviewHead("Natalie", "ooOOOO!", 10);
        assertNotEquals(
                "This should return the Nom Shack with 4.5 stars and 2 price",
                "Nom Shack has 4.5 stars and $2 price.",
                noms.toString());
    }

    @Test
    public void testRestaurantCreation_addReview_reviewReturn() {
        assertEquals(
                "This should return the Nom Shack reivews",
                "Bob had this to say: yackidy yack. Their review had 4 stars.\n" +
                        "Pat had this to say: blah blah blah. Their review had 5 stars.",
                noms.reviewsReturn());
    }

    @Test
    public void testRestaurantCreation_addReview_reviewReturn_false() {
        noms.addReviewHead("Natalie", "ooOOOO!", 10);
        assertNotEquals(
                "This should return the Nom Shack reivews",
                "Bob had this to say: yackidy yack. Their review had 4 stars.\n" +
                        "Pat had this to say: blah blah blah. Their review had 5 stars.",
                noms.reviewsReturn());
    }

    @Test
    public void testHead(){
        System.out.println(noms.head.data.toString());
    }
}