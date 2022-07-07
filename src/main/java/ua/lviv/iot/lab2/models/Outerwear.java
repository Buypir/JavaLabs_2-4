package ua.lviv.iot.lab2.models;

import lombok.*;

@Getter(AccessLevel.NONE)
@Setter(AccessLevel.NONE)

public class Outerwear extends SportWear {
    private String sizeInLetters;
    private boolean isHasHood;
    private String season;

    public Outerwear(String name, int quantity, String origin, String color, double priceInUah, String sex,
                     String material, boolean isAdult, String brand, float percentageOfCotton, String sizeInLetters,
                     boolean isHasHood, String season) {
        super(name, quantity, origin, color, priceInUah, sex, material, isAdult, brand, percentageOfCotton);
        this.sizeInLetters = sizeInLetters;
        this.isHasHood = isHasHood;
        this.season = season;
    }
    @Override
    public String getHeaders(){
        return super.getHeaders() + ", sizeInLetters";
    }
    @Override
    public String toCSV() {
        return super.toCSV() + ", " + sizeInLetters;
    }

    @Override
    public String toString() {
        return  "\n" + super.toString() +
                " sizeInLetters:" + sizeInLetters +
                ", isHasHood:" + isHasHood +
                ", season:" + season ;


    }
}
