package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    Shop CatCandyWonderShop;

    @Before
    public void setUp() throws Exception {
        CatCandyWonderShop = new Shop("Cat Candy Wonder Shop", 5);
        CatCandyWonderShop.addReviewHead("Julie", "Pip loves the kitty crack catnip! It's da best!", 5);
        CatCandyWonderShop.addReviewHead("Jon", "It's alright. I sprinkle some catnip in my coffee. Yum, meow", 4);
    }

    @Test
    public void addReviewHead() {
        assertEquals("The head review should be from Jon",
                "Jon",
                CatCandyWonderShop.head.data.author);
    }

    @Test
    public void addReviewHeadFail() {
        assertNotEquals("The head review should be from Jon, not James",
                "James",
                CatCandyWonderShop.head.data.author);
    }

    @Test
    public void testToString() {
        assertEquals("The shop should have 4.5 stars and 5 price.",
                "Cat Candy Wonder Shop has 4.5 stars and $5 price.",
                CatCandyWonderShop.toString());
    }

    @Test
    public void testToStringFail() {
        assertNotEquals("The shop should have 4.5 stars and 5 price. It should not match an empty string",
                "",
                CatCandyWonderShop.toString());
    }

    @Test
    public void reviewsReturn() {
        assertEquals("The shop will have two reviews",
                "Jon had this to say: It's alright. I sprinkle some catnip in my coffee. Yum, meow. Their review had 4 stars.\n" +
                        "Julie had this to say: Pip loves the kitty crack catnip! It's da best!. Their review had 5 stars.",
        CatCandyWonderShop.reviewsReturn());
    }

    @Test
    public void reviewsReturnFail() {
        assertNotEquals("The shop will have two reviews, not just one.",
                "Jon had this to say: It's alright. I sprinkle some catnip in my coffee. Yum, meow. Their review had 4 stars.\n",
                CatCandyWonderShop.reviewsReturn());
    }
}