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
    public void totalProfit(){
        shop1.addStock(trumpet1);
        shop1.addStock(trumpet2);
        shop1.addStock(guitar1);
        shop1.addStock(guitar2);
        assertEquals(48.84,shop1.totalProfit(),0.01);
    }

    @Test
    public void stocksEmpty(){
        assertEquals(0,shop1.getInstruments().size());
    }

    @Test
    public void inventoryListEmpty(){
        assertEquals(0,shop1.getInventoryList().size());
    }

    @Test
    public void addStock() {
        shop1.addStock(trumpet1);
        shop1.addStock(trumpet2);
        assertEquals(2,shop1.getInstruments().size());
    }

    @Test
    public void removeStock() {
        shop1.addStock(trumpet1);
        shop1.addStock(trumpet2);
        shop1.removeStock(trumpet2);
        assertEquals(1,shop1.getInstruments().size());
    }
}
