package main.java.instruments;
import java.lang.String;

public enum ColorType {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet"),
    BRONZE("Bronze"),
    SILVER("Silver"),
    GOLD("Gold");

    private String color;

    ColorType(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
