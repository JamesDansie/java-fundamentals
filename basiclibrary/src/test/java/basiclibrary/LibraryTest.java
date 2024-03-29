/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void testLengthMethod(){
        assertEquals(
                "The array should be 3 long",
                3,
                Library.roll(3).length
        );
    }

    @Test public void dupTrue(){
        assertEquals(
                "The array has duplicate, should return true",
                true,
                Library.containsDuplicates(new int[]{1, 1})
        );
    }

    @Test public void dupFalse(){
        assertEquals(
                "the array has no duplicates, should return false",
                false,
                Library.containsDuplicates(new int[]{1, 2, 3, 4})
        );
    }

    @Test public void arrAvg(){
        assertEquals(
                "The average should be 2",
                2.0f,
                Library.arrAvg(new int[]{1, 2, 3}),
                0.05f
        );
    }

    @Test public void arrNotAvg(){
        assertNotEquals(
                "The average should be 2, but is not",
                3.0f,
                Library.arrAvg(new int[]{1, 2, 3}),
                        0.05f
        );
    }

    @Test public void arrArrlength(){
        int[][] testArr = {
                {1, 2, 1, 2, 1, 2},
                {3, 4, 3, 4, 3, 4},
                {5, 6, 5, 6, 5, 6}
        };
        assertArrayEquals(
                "Should return an array of [1.5, 3.5, 5.5]",
                new float[]{1.5f, 3.5f, 5.5f},
                Library.arrAvgLots(testArr),
                0.05f
        );
    }

    @Test public void arrArrDifflength(){
        int[][] testArr = {
                {1, 2, 1, 2, 1, 2, 1, 2},
                {3, 4, 3, 4},
                {5, 6, 5, 6, 5, 6}
        };
        assertArrayEquals(
                "Should return an array of [1.5, 3.5, 5.5]",
                new float[]{1.5f, 3.5f, 5.5f},
                Library.arrAvgLots(testArr),
                0.05f
        );
    }

    @Test public void arrAvgLowest(){
        int[][] testArr = {
                {1, 2, 1, 2, 1, 2, 1, 2},
                {3, 4, 3, 4},
                {5, 6, 5, 6, 5, 6}
        };
        assertArrayEquals(
                "Should return [1, 2, 1, 2, 1, 2, 1, 2]",
                new int[]{1, 2, 1, 2, 1, 2, 1, 2},
                Library.arrAvgLow(testArr)
        );
    }

    @Test public void weather(){
        // Daily average temperatures for Seattle, October 1-28 2017
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertEquals(
                "Should do stuff",
                "High: 72\n" +
                "Low: 51\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69\n",
                Library.weather(weeklyMonthTemperatures)
        );
    }

    @Test public void winner(){
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        assertEquals(
                "Should have Bush win",
                "Bush",
                Library.tally(votes)
        );
    }
}
