package main.java.shop;

import main.java.behaviours.ISell;
import main.java.instruments.Instrument;

import java.util.ArrayList;

public class Shop implements ISell {
    private ArrayList<ISell>instruments;


    public Shop() {
        this.instruments = instruments;
    }

    public ArrayList<ISell> getInstruments() {
        return instruments;
    }

    public void setInstruments(ArrayList<ISell> instruments) {
        this.instruments = instruments;
    }

    @Override
    public double calculateMarkup(double buyingPrice, double sellingPrice) {
        return (((sellingPrice-buyingPrice)/sellingPrice)*100);
    }

    @Override
    public void addStock(Instrument instrument) {

    }

    @Override
    public void removeStock(Instrument instrument) {

    }
}
