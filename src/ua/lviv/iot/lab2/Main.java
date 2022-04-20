package ua.lviv.iot.lab2;
import ua.lviv.iot.lab2.models.*;
import ua.lviv.iot.lab2.manager.impl.SportWearManager;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Backpack SportBag = new Backpack("Backpack" , 4,"Afghanistan", "Gray", 1300,
                "Unisex", "cotton", true, "Puma", 46.2f, 3,true);
        System.out.print(SportBag);
        Outerwear Hoodie = new Outerwear("Hoodie" , 13,"Afghanistan", "White", 800,
                "Male", "cotton", true, "TNF", 66.3f, "L", true, "All season");
        System.out.println(Hoodie);
        Sneakers AirForce = new Sneakers("Nike air force", 2,"Indonesia", "White", 2100,
                "Female", "Synthetic leather", true, "Nike", 0, 23, "rubber", "White");
        System.out.println(AirForce);
        ThermalUnderwear ThermalSuit = new ThermalUnderwear("Thermal suit", 3,"Ukraine", "Black", 1500,
                "unisex", "Polyester and cotton", true, "reebok", 70, true);
        System.out.print(ThermalSuit);
        Tracksuit Tracksuit = new Tracksuit("Sport suit", 5,"USA", "Blue", 700, "male", "cotton", false, "Adidas",
                23.5f, "XL", false, "Spring", "clothes for outdoor sports", true);
        System.out.print(Tracksuit);
    }
}
