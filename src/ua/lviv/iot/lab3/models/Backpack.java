package ua.lviv.iot.lab3.models;

public class Backpack extends SportWear{
    private int numberOfPockets;
    private boolean isHasPowerBank;

    public Backpack(String name, int quantity, String origin, String color, double priceInUah, String sex, String material,
                    boolean isAdult, String brand, float percentageOfCotton,
                    int numberOfPockets, boolean isHasPowerBank) {
        super(name, quantity, origin, color, priceInUah, sex, material, isAdult, brand, percentageOfCotton);
        this.numberOfPockets = numberOfPockets;
        this.isHasPowerBank = isHasPowerBank;
    }

    public int getNumberOfPockets() {
        return numberOfPockets;
    }

    public void setNumberOfPockets(int numberOfPockets) {
        this.numberOfPockets = numberOfPockets;
    }

    public boolean isHasPowerBank() {
        return isHasPowerBank;
    }

    public void setHasPowerBank(boolean hasPowerBank) {
        isHasPowerBank = hasPowerBank;
    }
    @Override
    public String toString() {
        return  "" +
                "\n" +super.toString() +
                "numberOfPockets:" + numberOfPockets +
                ", isHasPowerBank:" + isHasPowerBank ;

    }
}

