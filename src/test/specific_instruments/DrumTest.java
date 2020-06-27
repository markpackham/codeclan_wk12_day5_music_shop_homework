package test.specific_instruments;

import main.java.instruments.ColorType;
import main.java.instruments.specific_instruments.Drum;
import main.java.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {
    Drum drum1;

    @Before
    public void before(){
        drum1 = new Drum("Ginger Baker Special Set", "Thudddd", 500,700,30, InstrumentType.PERCUSSION, ColorType.ORANGE, 4 );
    }

    @Test
    public void setName() {
        drum1.setName("A New Name");
        assertEquals("A New Name",drum1.getName());
    }

    @Test
    public void setSound() {
        drum1.setSound("Meow");
        assertEquals("Meow",drum1.getSound());
    }

    @Test
    public void setBuyingPrice() {
        drum1.setBuyingPrice(1);
        assertEquals(1,drum1.getBuyingPrice(),0.01);
    }

    @Test
    public void setSellingPrice() {
        drum1.setSellingPrice(2);
        assertEquals(2,drum1.getSellingPrice(),0.01);
    }

    @Test
    public void setWeightKg() {
        drum1.setWeightKg(100);
        assertEquals(100,drum1.getWeightKg(),0.01);
    }

    @Test
    public void getInstrumentType() {
        assertEquals("Percussion",drum1.getInstrumentType().getName());
    }

    @Test
    public void getColorType() {
        assertEquals("Orange",drum1.getColorType().getColor());
    }

    @Test
    public void setSticks(){
        drum1.setSticks(300);
        assertEquals(300,drum1.getSticks());
    }

    @Test
    public void doubleDrumSticksGiven(){
        drum1.setSticks(300);
        drum1.doubleDrumSticksGiven();
        assertEquals(600,drum1.getSticks());
    }

    @Test
    public void play() {
        assertEquals("Thudddd",drum1.play());
    }
}
