package main.java.instruments;

public class Drum extends Percussion {
    public Drum(String name, String sound, double buyingPrice, double sellingPrice, double weightKg, InstrumentType instrumentType, ColorType colorType, int sticks) {
        super(name, sound, buyingPrice, sellingPrice, weightKg, instrumentType, colorType, sticks);
    }

    public void doubleDrumSticksGiven(){
        this.sticks = sticks * 2;
    }

}
