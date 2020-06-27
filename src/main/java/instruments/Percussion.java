package main.java.instruments;

public abstract class Percussion extends Instrument {
    protected int sticks;

    public Percussion(String name, String sound, double buyingPrice, double sellingPrice, double weightKg, InstrumentType instrumentType, ColorType colorType, int sticks) {
        super(name, sound, buyingPrice, sellingPrice, weightKg, instrumentType, colorType);
        this.instrumentType = InstrumentType.PERCUSSION;
        this.sticks = sticks;
    }

    public int getSticks() {
        return sticks;
    }

    public void setSticks(int sticks) {
        this.sticks = sticks;
    }
}
