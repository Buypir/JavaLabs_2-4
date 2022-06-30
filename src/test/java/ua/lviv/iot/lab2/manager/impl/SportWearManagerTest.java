package ua.lviv.iot.lab2.manager.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab2.enums.SortChoise;
import ua.lviv.iot.lab2.models.*;

import java.awt.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class SportWearManagerTest {
    SportWearManager manager;
    List<SportWear> sportWears;

    @BeforeEach
    void setUp() throws Exception {
        manager = new SportWearManager();
        sportWears = createdListOfSportWears();
        manager.addWears(sportWears);
        
    }

    @AfterEach
    void tearDown() throws Exception {

    }

    @Test
    public void testGeneral() {
        manager.sortByPercentageOfCotton(sportWears, SortChoise.ASCENDING);
        assertNotNull(manager.toString());
        manager.sortByPercentageOfCotton(sportWears, SortChoise.DESCENDING);
        assertNotNull(manager.toString());
        assertNotNull(sportWears.toString());
    }
    @Test
    void addWearsTest() {
        Assertions.assertFalse(manager.getAllSportWears().isEmpty());
        Assertions.assertEquals(7, manager.getAllSportWears().size());
    }

    @Test
    void findByPriceTest() {
        assertEquals("\nname:Backpack, brand:Puma, quantity:4, origin:Afghanistan, color:Gray," +
                " priceInUah:1300.0 uah, sex:Unisex, material:cotton, percentage of cotton: 46.2%," +
                " isAdult:true numberOfPockets:3, isHasPowerBank:true",
                manager.findByPrice(sportWears, 1300).toString());
    }
    @Test
    void findByWrongPriceTest() {
        assertNull(manager.findByPrice(sportWears, 562));;
    }

    @Test
    void findByWrongBrandTest() {
        assertNull(manager.findByBrand(sportWears, "pi-pi-py-py"));
    }

    @Test
    void findByBrandTest() {
        assertEquals("\nname:Thermal suit, brand:reebok, quantity:3, origin:Ukraine, color:Black," +
                " priceInUah:1500.0 uah, sex:unisex, material:Polyester and cotton, percentage of cotton: 70.0%," +
                " isAdult:true isTightFitting:true", manager.findByBrand(sportWears, "reebok").toString());
    }

    @Test
    void sortByPercentageOfCottonTest() {
        float[] expectedAscPrices = {0f, 15.2f, 23.5f, 46.2f, 66.3f, 70f, 75.2f };
        manager.sortByPercentageOfCotton(sportWears, SortChoise.ASCENDING);
        IntStream.range(0, 7).forEachOrdered(n -> {
            assertEquals(expectedAscPrices[n], sportWears.get(n).getPercentageOfCotton());
        });
        float[] expectedDescPrices = {75.2f, 70f, 66.3f, 46.2f, 23.5f, 15.2f, 0f};
        manager.sortByPercentageOfCotton(sportWears, SortChoise.DESCENDING);
        IntStream.range(0, 7).forEachOrdered(n -> {
            assertEquals(expectedDescPrices[n], sportWears.get(n).getPercentageOfCotton());
        });
    }


    public List<SportWear> createdListOfSportWears() {
        List<SportWear> sportWears = new LinkedList<>();
        Outerwear tShirt = new Outerwear("T-shirt" , 32,"Ukraine", "Orange", 300,
                "Male", "cotton", true, "TNF", 75.2f, "M", true, "All season");
        SportWear cap = new SportWear("Сap" , 7,"Afghanistan", "Blue", 120,
                "Unisex", "cotton", true, "CoolBoy", 15.2f);
        Backpack sportBag = new Backpack("Backpack" , 4,"Afghanistan", "Gray", 1300,
                "Unisex", "cotton", true, "Puma", 46.2f, 3,true);
        Outerwear hoodie = new Outerwear("Hoodie" , 13,"Afghanistan", "White", 800,
                "Male", "cotton", true, "TNF", 66.3f, "L", true, "All season");
        Sneakers airForce = new Sneakers("Nike air force", 2,"Indonesia", "White", 2100,
                "Female", "Synthetic leather", true, "Nike", 0, 23, "rubber", "White");
        ThermalUnderwear thermalSuit = new ThermalUnderwear("Thermal suit", 3,"Ukraine", "Black", 1500,
                "unisex", "Polyester and cotton", true, "reebok", 70, true);
        Tracksuit tracksuit = new Tracksuit("Sport suit", 5,"USA", "Blue", 700, "male", "cotton", false, "Adidas",
                23.5f, "XL", false, "Spring", "clothes for outdoor sports", true);
        sportWears.add(cap);
        sportWears.add(sportBag);
        sportWears.add(hoodie);
        sportWears.add(airForce);
        sportWears.add(thermalSuit);
        sportWears.add(tracksuit);
        sportWears.add(tShirt);
        return sportWears;
    }

}