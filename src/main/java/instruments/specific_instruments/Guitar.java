package main.java.instruments.specific_instruments;

import main.java.instruments.ColorType;
import main.java.instruments.InstrumentType;
import main.java.instruments.StringInstrument;

public final class Guitar extends StringInstrument {

    public Guitar(String name, String sound, double buyingPrice, double sellingPrice, double weightKg, InstrumentType instrumentType, ColorType colorType, int stringsNumber) {
        super(name, sound, buyingPrice, sellingPrice, weightKg, instrumentType, colorType, stringsNumber);
    }

}
