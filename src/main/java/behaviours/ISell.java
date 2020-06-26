package main.java.behaviours;

import main.java.instruments.Instrument;

public interface ISell {

    double calculateMarkup(double buyingPrice, double sellingPrice);

    void addStock(Instrument instrument);

    void removeStock(Instrument instrument);

    String inventorySort();

    double totalProfit();

    void sellInstrument(Instrument instrument);
}
