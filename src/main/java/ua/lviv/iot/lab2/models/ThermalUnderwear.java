package ua.lviv.iot.lab2.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(AccessLevel.NONE)
@Setter(AccessLevel.NONE)

public class ThermalUnderwear extends SportWear{
    private boolean isTightFitting;

    public ThermalUnderwear(String name, int quantity, String origin, String color, double priceInUah, String sex,
                            String material, boolean isAdult, String brand,
                            float percentageOfCotton, boolean isTightFitting) {
        super(name, quantity, origin, color, priceInUah, sex, material, isAdult, brand, percentageOfCotton);
        this.isTightFitting = isTightFitting;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() +
                " isTightFitting:" + isTightFitting ;


    }
}
