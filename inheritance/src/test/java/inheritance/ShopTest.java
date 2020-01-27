package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void testToString() {
        Shop testShop = new Shop("Broken Lantern",
                "$");
        String testShopToString = "Shop name: Broken Lantern | Rating: 0.0 | Price Category $";
        assertEquals(testShopToString,
                testShop.toString());
    }
@Test
    public void testAddShop() {
        Shop testShop = new Shop("Broken Lantern",
                "$$$");
        assertEquals("Broken Lantern", testShop.name);

    }
}