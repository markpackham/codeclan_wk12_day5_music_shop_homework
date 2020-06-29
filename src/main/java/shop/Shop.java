package main.java.shop;

import main.java.behaviours.ISell;
import main.java.instruments.Instrument;

import java.util.ArrayList;
import java.util.Collections;

public class Shop implements ISell {
    private ArrayList<Instrument>instruments;
    private double shopMoney;

    public Shop(double shopMoney) {
        this.shopMoney = shopMoney;
        this.instruments = new ArrayList<Instrument>();
    }

    public ArrayList<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(ArrayList<Instrument> instruments) {
        this.instruments = instruments;
    }

    public double getShopMoney() {
        return shopMoney;
    }

    public void setShopMoney(double shopMoney) {
        this.shopMoney = shopMoney;
    }

    @Override
    public void addStock(Instrument instrument) {
        this.instruments.add(instrument);
    }

    @Override
    public void removeStock(Instrument instrument) {
        this.instruments.remove(instrument);
    }

    @Override
    public String inventorySort(){
        ArrayList inventoryList = new ArrayList<>();
        for(Instrument item:instruments){
            inventoryList.add(item.getName());
        }
        Collections.sort(inventoryList);
        return inventoryList.toString();
    }

    @Override
    public double calculateMarkup(double buyingPrice, double sellingPrice) {
        if(sellingPrice > 0) {
            return sellingPrice-buyingPrice;
        }else{
            return 0;
        }
    }

    @Override
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

    @Override
    public void sellInstrument(Instrument instrument) {
        removeStock(instrument);
        shopMoney += instrument.getSellingPrice();
    }

    @Override
    public void buyInstrument(Instrument instrument){
        addStock(instrument);
        shopMoney -= instrument.getBuyingPrice();
    }
}
