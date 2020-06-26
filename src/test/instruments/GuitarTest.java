package test.instruments;

import main.java.instruments.ColorType;
import main.java.instruments.Guitar;
import main.java.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar1;
    Guitar guitar2;

    @Before
    public void setUp() throws Exception {
        guitar1 = new Guitar("Stratocaster","Twang",100,200,1, InstrumentType.STRING, ColorType.BLUE, 6);
        guitar2 = new Guitar ("ReggieBass", "Twoon", 90, 190, 2, InstrumentType.STRING, ColorType.RED, 5);
    }

    @Test
    public void setName() {
        guitar1.setName("A New Name");
        assertEquals("A New Name",guitar1.getName());
    }

    @Test
    public void setSound() {
        guitar1.setSound("Meow");
        assertEquals("Meow",guitar1.getSound());
    }

    @Test
    public void setBuyingPrice() {
        guitar1.setBuyingPrice(1);
        assertEquals(1,guitar1.getBuyingPrice(),0.01);
    }

    @Test
    public void setSellingPrice() {
        guitar1.setSellingPrice(2);
        assertEquals(2,guitar1.getSellingPrice(),0.01);
    }

    @Test
    public void setWeightKg() {
        guitar1.setWeightKg(100);
        assertEquals(100,guitar1.getWeightKg(),0.01);
    }

    @Test
    public void getInstrumentType() {
        assertEquals("String",guitar1.getInstrumentType().getName());
    }

    @Test
    public void getColorType() {
        assertEquals("Blue",guitar1.getColorType().getColor());
    }

    @Test
    public void stringsNumber(){
        guitar1.setStringsNumber(12);
        assertEquals(12,guitar1.getStringsNumber());
    }

    @Test
    public void play() {
        assertEquals("Twang",guitar1.play());
    }
}