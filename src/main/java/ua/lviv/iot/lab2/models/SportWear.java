package ua.lviv.iot.lab2.models;

import lombok.AccessLevel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter(AccessLevel.NONE)
public class SportWear {
    private String name;
    private int quantity;
    private String origin;
    private String color;
    private double priceInUah;
    private String sex;
    private String material;
    private boolean isAdult;
    private String brand;
    private float percentageOfCotton;

    public SportWear(String name, int quantity, String origin, String color, double priceInUah, String sex,
                     String material, boolean isAdult, String brand, float percentageOfCotton) {
        this.name = name;
        this.quantity = quantity;
        this.origin = origin;
        this.color = color;
        this.priceInUah = priceInUah;
        this.sex = sex;
        this.material = material;
        this.isAdult = isAdult;
        this.brand = brand;
        this.percentageOfCotton = percentageOfCotton;
    }

    public String getHeaders() {
        return "name, quantity, color, priceInUah";
    }

    public String toCSV() {
        return name + ", " + quantity + ", " + color + ", " + priceInUah + " uah ";
    }
    @Override
    public String toString() {
        return
                "name:" + name + ", brand:" + brand +
                        ", quantity:" + quantity +
                        ", origin:" + origin +
                        ", color:" + color +
                        ", priceInUah:" + priceInUah +
                        " uah, sex:" + sex +
                        ", material:" + material +
                        ", percentage of cotton: " + percentageOfCotton +
                        "%, isAdult:" + isAdult;

    }
}
