package main.java.shop;

import main.java.behaviours.ISell;
import main.java.instruments.Instrument;

import java.util.ArrayList;

public class Shop implements ISell {
    private ArrayList<Instrument>instruments;
    private ArrayList<Instrument>inventoryList;


    public Shop() {
        this.instruments = new ArrayList<Instrument>();
        this.inventoryList = new ArrayList<Instrument>();
    }

    public ArrayList<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(ArrayList<Instrument> instruments) {
        this.instruments = instruments;
    }

    public ArrayList<Instrument> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<Instrument> inventoryList) {
        this.inventoryList = inventoryList;
    }

    @Override
    public double calculateMarkup(double buyingPrice, double sellingPrice) {
        return (((sellingPrice-buyingPrice)/sellingPrice)*100);
    }

    @Override
    public void addStock(Instrument instrument) {
        this.instruments.add(instrument);
    }

    @Override
    public void removeStock(Instrument instrument) {
        this.instruments.remove(instrument);
    }

    public String inventorySort(){
        String nameList = "";
        for (Instrument item:instruments
             ) {
            nameList += item.getName() + ", ";
        }
        // remove last comma and space
        nameList = nameList.substring(0,nameList.length()-2);
        return nameList;
    }

    public double totalProfit() {
        double buyPrice = 0;
        double sellPrice = 0;
        for (Instrument instrument:
             instruments) {
            buyPrice += instrument.getBuyingPrice();
            sellPrice += instrument.getSellingPrice();
        }
        if(sellPrice>0){
        return calculateMarkup(buyPrice,sellPrice);
        }
        else{
            return 0;
        }
    }
}
