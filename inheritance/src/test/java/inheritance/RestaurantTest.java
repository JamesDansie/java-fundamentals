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

}