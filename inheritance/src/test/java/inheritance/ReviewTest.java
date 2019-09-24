package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    Review review;
    @Before
    public void setup(){
        review = new Review("Pat", "Salmon cookies are amazing! and totally not made from left over fish bits.", 5);
    }

    @Test
    public void testReviewCreation_toString() {
        assertEquals(
                "This should return Pat's review of salmon cookies",
                "Pat had this to say: Salmon cookies are amazing! and totally not made from left over fish bits.. Their review had 5 stars.",
                review.toString());
    }
}