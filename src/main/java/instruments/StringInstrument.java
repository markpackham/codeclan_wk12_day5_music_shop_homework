package main.java.instruments;

public abstract class StringInstrument extends Instrument{
    protected int stringsNumber;

    public StringInstrument(String name, String sound, double buyingPrice, double sellingPrice, double weightKg, InstrumentType instrumentType, ColorType colorType, int stringsNumber) {
        super(name, sound, buyingPrice, sellingPrice, weightKg, instrumentType, colorType);
        this.instrumentType = InstrumentType.STRING;
        this.stringsNumber = stringsNumber;
    }

    public int getStringsNumber() {
        return stringsNumber;
    }

    public void setStringsNumber(int stringsNumber) {
        this.stringsNumber = stringsNumber;
    }
}
