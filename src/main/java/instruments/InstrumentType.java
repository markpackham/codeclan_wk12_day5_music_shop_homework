package main.java.instruments;
import java.lang.String;

public enum InstrumentType {
    BRASS("Brass"),
    KEYBOARD("Keyboard"),
    PERCUSSION("Percussion"),
    STRING("String"),
    WOODWIND("Woodwind");

    private String name;

    InstrumentType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
