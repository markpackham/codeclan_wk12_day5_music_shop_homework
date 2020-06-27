package main.java.instruments.specific_instruments;

import main.java.instruments.BrassInstrument;
import main.java.instruments.ColorType;
import main.java.instruments.InstrumentType;

public final class Trumpet extends BrassInstrument {
    public Trumpet(String name, String sound, double buyingPrice, double sellingPrice, double weightKg, InstrumentType instrumentType, ColorType colorType, int valves) {
        super(name, sound, buyingPrice, sellingPrice, weightKg, instrumentType, colorType, valves);
    }

}
