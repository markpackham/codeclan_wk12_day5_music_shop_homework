package test.shop;

import main.java.instruments.ColorType;
import main.java.instruments.Guitar;
import main.java.instruments.InstrumentType;
import main.java.instruments.Trumpet;
import main.java.shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop1;
    Shop shop2;
    Trumpet trumpet1;
    Trumpet trumpet2;
    Guitar guitar1;
    Guitar guitar2;

    @Before
    public void setUp() throws Exception {
        shop1 = new Shop();
        shop2 = new Shop();
        trumpet1 = new Trumpet("Count Bassie", "Brrroo",30,40,2, InstrumentType.BRASS, ColorType.SILVER,4);
        trumpet2 = new Trumpet("War Horn", "Braooooow", 1, 2, 4, InstrumentType.BRASS, ColorType.GOLD, 5);
        guitar1 = new Guitar("Stratocaster","Twang",100,200,1, InstrumentType.STRING, ColorType.BLUE, 6);
        guitar2 = new Guitar ("ReggieBass", "Twoon", 90, 190, 2, InstrumentType.STRING, ColorType.RED, 5);
    }

    @Test
    public void calculateMarkup(){
    assertEquals(25.0,shop1.calculateMarkup(trumpet1.getBuyingPrice(),trumpet1.getSellingPrice()),0.01);
    }

    @Test
    public void stocksEmpty(){
        assertEquals(null,shop1.getInstruments());
    }

    @Test
    public void addStock() {
    }

    @Test
    public void removeStock() {
    }

}
