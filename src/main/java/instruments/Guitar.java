package main.java.instruments;

public final class Guitar extends StringInstrument {

    public Guitar(String name, String sound, double buyingPrice, double sellingPrice, double weightKg, InstrumentType instrumentType, ColorType colorType, int stringsNumber) {
        super(name, sound, buyingPrice, sellingPrice, weightKg, instrumentType, colorType, stringsNumber);
    }

}
