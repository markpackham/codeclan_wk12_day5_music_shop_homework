package main.java.instruments;

public abstract class BrassInstrument extends Instrument {
    protected int valves;

    public BrassInstrument(String name, String sound, double buyingPrice, double sellingPrice, double weightKg, InstrumentType instrumentType, ColorType colorType, int valves) {
        super(name, sound, buyingPrice, sellingPrice, weightKg, instrumentType, colorType);
        this.instrumentType = InstrumentType.BRASS;
        this.valves = valves;
    }

    public int getValves() {
        return valves;
    }

    public void setValves(int valves) {
        this.valves = valves;
    }
}
