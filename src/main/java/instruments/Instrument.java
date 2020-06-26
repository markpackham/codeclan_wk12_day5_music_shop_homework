package main.java.instruments;

import main.java.behaviours.IPlay;

public abstract class Instrument implements IPlay {

    protected String name;
    protected String sound;
    protected double buyingPrice;
    protected double sellingPrice;
    protected double weightKg;
    protected InstrumentType instrumentType;
    protected ColorType colorType;

    public Instrument(String name, String sound, double buyingPrice, double sellingPrice, double weightKg, InstrumentType instrumentType, ColorType colorType) {
        this.name = name;
        this.sound = sound;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.weightKg = weightKg;
        this.instrumentType = instrumentType;
        this.colorType = colorType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public ColorType getColorType() {
        return colorType;
    }

    @Override
    public String play() {
        return sound;
    }
}
