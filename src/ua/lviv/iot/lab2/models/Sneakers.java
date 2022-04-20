package ua.lviv.iot.lab2.models;
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

    public int getSizeInCentimeters() {
        return sizeInCentimeters;
    }

    public void setSizeInCentimeters(int sizeInCentimeters) {
        this.sizeInCentimeters = sizeInCentimeters;
    }

    public String getSoleMaterial() {
        return soleMaterial;
    }

    public void setSoleMaterial(String soleMaterial) {
        this.soleMaterial = soleMaterial;
    }

    public String getColorOfLaces() {
        return colorOfLaces;
    }

    public void setColorOfLaces(String colorOfLaces) {
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
