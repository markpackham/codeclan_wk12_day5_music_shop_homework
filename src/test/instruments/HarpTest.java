package test.instruments;

import main.java.instruments.ColorType;
import main.java.instruments.specific_instruments.Harp;
import main.java.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HarpTest {
    Harp harp1;

    @Before
    public void setUp() throws Exception {
        harp1 = new Harp("Harpy","Pluck",1000,2000,10, InstrumentType.STRING, ColorType.VIOLET, 100);
    }

    @Test
    public void setName() {
        harp1.setName("A New Name");
        assertEquals("A New Name",harp1.getName());
    }

    @Test
    public void setSound() {
        harp1.setSound("Meow");
        assertEquals("Meow",harp1.getSound());
    }

    @Test
    public void setBuyingPrice() {
        harp1.setBuyingPrice(1);
        assertEquals(1,harp1.getBuyingPrice(),0.01);
    }

    @Test
    public void setSellingPrice() {
        harp1.setSellingPrice(2);
        assertEquals(2,harp1.getSellingPrice(),0.01);
    }

    @Test
    public void setWeightKg() {
        harp1.setWeightKg(100);
        assertEquals(100,harp1.getWeightKg(),0.01);
    }

    @Test
    public void getInstrumentType() {
        assertEquals("String",harp1.getInstrumentType().getName());
    }

    @Test
    public void getColorType() {
        assertEquals("Violet",harp1.getColorType().getColor());
    }

    @Test
    public void stringsNumber(){
        harp1.setStringsNumber(12);
        assertEquals(12,harp1.getStringsNumber());
    }

    @Test
    public void play() {
        assertEquals("Pluck",harp1.play());
    }
}
