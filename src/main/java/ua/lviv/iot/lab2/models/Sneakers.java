package ua.lviv.iot.lab2.models;

import lombok.*;

@Getter(AccessLevel.NONE)
@Setter(AccessLevel.NONE)


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
    public String getHeaders() {
        return super.getHeaders() + ", sizeInCentimeters";
    }
    @Override
    public String toCSV() {
        return super.toCSV() + ", " + sizeInCentimeters;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() +
                " sizeInCentimeters:" + sizeInCentimeters +
                ", soleMaterial:" + soleMaterial +
                ", colorOfLaces:" + colorOfLaces ;
    }
}
