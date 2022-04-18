package ua.lviv.iot.lab3.models;

public class ThermalUnderwear extends SportWear{
    private boolean isTightFitting;

    public ThermalUnderwear(String name, int quantity, String origin, String color, double priceInUah, String sex,
                            String material, boolean isAdult, String brand,
                            float percentageOfCotton, boolean isTightFitting) {
        super(name, quantity, origin, color, priceInUah, sex, material, isAdult, brand, percentageOfCotton);
        this.isTightFitting = isTightFitting;
    }

    public boolean isTightFitting() {
        return isTightFitting;
    }

    public void setTightFitting(boolean tightFitting) {
        isTightFitting = tightFitting;
    }
    @Override
    public String toString() {
        return "\n" + super.toString() +
                "isTightFitting:" + isTightFitting ;


    }
}
