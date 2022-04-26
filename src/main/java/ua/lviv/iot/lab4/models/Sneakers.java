package ua.lviv.iot.lab2.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Sneakers extends SportWear{
    private int sizeInCentimeters;
    private String soleMaterial;
    private String colorOfLaces;

    public Sneakers(String name, int quantity, String origin, String color, double priceInUah, String sex, String material,
                    boolean isAdult, String brand, float percentageOfCotton, int sizeInCentimeters, String soleMaterial,
                    String colorOfLaces) {
        super(name, quantity, origin, color, priceInUah, sex, material, isAdult, brand, percentageOfCotton);
        this.sizeInCentimeters = sizeInCentimeters;
        this.soleMaterial = soleMaterial;
        this.colorOfLaces = colorOfLaces;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() +
                "sizeInCentimeters:" + sizeInCentimeters +
                ", soleMaterial:" + soleMaterial +
                ", colorOfLaces:" + colorOfLaces ;
    }
}
