package ua.lviv.iot.lab3;
import ua.lviv.iot.lab3.models.*;
import ua.lviv.iot.lab3.manager.impl.SportWearManager;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        List<SportWear> sportWear = new LinkedList<>();
        SportWearManager manager = new SportWearManager();
        Backpack SportBag = new Backpack("Backpack" , 4,"Afghanistan", "Gray", 1300,
                "Unisex", "cotton", true, "Puma", 46.2f, 3,true);
        Outerwear Hoodie = new Outerwear("Hoodie" , 13,"Afghanistan", "White", 800,
                "Male", "cotton", true, "TNF", 66.3f, "L", true, "All season");
        Sneakers AirForce = new Sneakers("Nike air force", 2,"Indonesia", "White", 2100,
                "Female", "Synthetic leather", true, "Nike", 0, 23, "rubber", "White");
        ThermalUnderwear ThermalSuit = new ThermalUnderwear("Thermal suit", 3,"Ukraine", "Black", 1500,
                "unisex", "Polyester and cotton", true, "reebok", 70, true);
        Tracksuit Tracksuit = new Tracksuit("Sport suit", 5,"USA", "Blue", 700, "male", "cotton", false, "Adidas",
                23.5f, "XL", false, "Spring", "clothes for outdoor sports", true);
        sportWear.add(SportBag);
        sportWear.add(Hoodie);
        sportWear.add(AirForce);
        sportWear.add(ThermalSuit);
        sportWear.add(Tracksuit);
        manager.addWears(sportWear);
        System.out.print(sportWear);

        System.out.println(" Sort sport Wears by % of cotton: \n 1 - Low-high\n 2 - High-low\n Your choice(1/2): ");
        Scanner scan = new Scanner(System.in);
        int choicePrice = scan.nextInt();
        switch (choicePrice) {
            case 1 -> manager.sortByPercentageOfCotton(sportWear, false);
            case 2 -> manager.sortByPercentageOfCotton(sportWear, true);
            default -> System.out.println("Invalid choice");
        }
        System.out.println(sportWear);

        Scanner scanText = new Scanner(System.in);
        System.out.println("\nEnter price to find by:");
        double price = scanText.nextDouble();
        System.out.println(manager.findByPrice(sportWear, price));
        System.out.println("Enter brand to find by:");
        String brand = scanText.next();
        System.out.println(manager.findByBrand(sportWear, brand));



    }
}
