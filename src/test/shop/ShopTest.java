package test.shop;

import main.java.shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop1;
    Shop shop2;

    @Before
    public void setUp() throws Exception {
        shop1 = new Shop();
        shop2 = new Shop();
    }

    @Test
    public void stocksEmpty(){
        assertEquals(null,shop1.getInstruments());
    }
}
