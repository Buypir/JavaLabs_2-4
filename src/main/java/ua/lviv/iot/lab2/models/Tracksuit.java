package ua.lviv.iot.lab2.models;


import lombok.*;

@Getter(AccessLevel.NONE)
@Setter(AccessLevel.NONE)


public class Tracksuit extends Outerwear{
    private String purpose;     //gym clothes, clothes for outdoor sports, walking suits
    private boolean isSameDesign;

    public Tracksuit(String name, int quantity, String origin, String color, double priceInUah, String sex,
                     String material, boolean isAdult, String brand, float percentageOfCotton, String sizeInLetters,
                     boolean isHasHood, String season, String purpose, boolean isSameDesign) {
        super(name, quantity, origin, color, priceInUah, sex, material, isAdult,
                brand, percentageOfCotton, sizeInLetters, isHasHood, season);
        this.purpose = purpose;
        this.isSameDesign = isSameDesign;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", purpose:" + purpose +
                ", isSameDesign:" + isSameDesign;

    }
}

