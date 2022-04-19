package ua.lviv.iot.lab2.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
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
                        "%, isAdult:" + isAdult ;

    }
}