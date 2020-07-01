package openClosePrincip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Open close principle

public class Product {


    public String name;
    public Color color;
    public Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }


    public enum Color {
        RED, GREEN, BLUE
    }

    public enum Size {
        SMALL, MEDIUM, LARGE, YUGE
    }

}


