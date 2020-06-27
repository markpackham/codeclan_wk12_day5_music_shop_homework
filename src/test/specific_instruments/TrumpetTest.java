package test.specific_instruments;

import main.java.instruments.ColorType;
import main.java.instruments.InstrumentType;
import main.java.instruments.specific_instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet1;
    Trumpet trumpet2;

    @Before
    public void setUp() throws Exception {
        trumpet1 = new Trumpet("Count Bassie", "Brrroo",30,40,2, InstrumentType.BRASS, ColorType.SILVER,4);
        trumpet2 = new Trumpet("War Horn", "Braooooow", 1, 2, 4, InstrumentType.BRASS, ColorType.GOLD, 5);
    }

    @Test
    public void setName() {
        trumpet1.setName("A New Name");
        assertEquals("A New Name",trumpet1.getName());
    }

    @Test
    public void setSound() {
        trumpet1.setSound("Meow");
        assertEquals("Meow",trumpet1.getSound());
    }

    @Test
    public void setBuyingPrice() {
        trumpet1.setBuyingPrice(1);
        assertEquals(1,trumpet1.getBuyingPrice(),0.01);
    }

    @Test
    public void setSellingPrice() {
        trumpet1.setSellingPrice(2);
        assertEquals(2,trumpet2.getSellingPrice(),0.01);
    }

    @Test
    public void setWeightKg() {
        trumpet1.setWeightKg(100);
        assertEquals(100,trumpet1.getWeightKg(),0.01);
    }

    @Test
    public void getInstrumentType() {
        assertEquals("Brass",trumpet1.getInstrumentType().getName());
    }

    @Test
    public void getColorType() {
        assertEquals("Silver",trumpet1.getColorType().getColor());
    }

    @Test
    public void setValves(){
        trumpet1.setValves(10);
        assertEquals(10,trumpet1.getValves());
    }

    @Test
    public void play() {
        assertEquals("Brrroo",trumpet1.play());
    }
}