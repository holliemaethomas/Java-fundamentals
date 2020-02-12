package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testToString() {
        Restaurant testRestaurant = new Restaurant("Farmers Daughter",
                "$");
        String testRestaurantToString = "Restaurant name: Farmers Daughter | Rating: 0.0 | Price Category $";
        assertEquals(testRestaurantToString,
                testRestaurant.toString());
    }

    @Test
    public void testAddReview() {
        Restaurant testRestaurant = new Restaurant("Farmers Daughter",
                "$");
        assertEquals(testRestaurant.rating, "$");

    }
}
