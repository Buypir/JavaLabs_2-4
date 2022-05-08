package ua.lviv.iot.lab2.manager.impl;

import ua.lviv.iot.lab2.enums.SortChoise;
import ua.lviv.iot.lab2.manager.ISportWearManager;
import ua.lviv.iot.lab2.models.SportWear;

import java.util.*;


public class SportWearManager implements ISportWearManager {
    private final Map<String, SportWear> sportWearMap = new HashMap<>();
    @Override
    public void addWears(List<SportWear> sportWears) {
        for(SportWear sportWear : sportWears) {
            if(sportWearMap.containsKey(generateKey(sportWear)))
                throw new RuntimeException("Sport wear already Exists");
            sportWearMap.put(generateKey(sportWear),sportWear);
        }
    }
    private String generateKey(SportWear sportWear){
        return String.format("%s-%s", sportWear.getPriceInUah(), sportWear.getBrand());
    }

    @Override
    public SportWear findByPrice(List<SportWear> sportWears, double price) {
        for(SportWear sportWear : sportWears) {
            if(sportWear.getPriceInUah() == price) {
                return sportWear;
            }
        }
        return null;
    }

    @Override
    public SportWear findByBrand(List<SportWear> sportWears, String brand) {
        for(SportWear sportWear : sportWears) {
            if(sportWear.getBrand().equals(brand)) {
                return sportWear;
            }

        }
        return null;
    }

    @Override
    public void sortByPercentageOfCotton(List<SportWear> sportWears, SortChoise choice) {
        if(choice == SortChoise.DESCENDING)
            sportWears.sort(Collections.reverseOrder(Comparator.comparing(SportWear::getPercentageOfCotton)));
        else
            sportWears.sort(Comparator.comparing(SportWear::getPercentageOfCotton));
    }
    public Collection<SportWear> getAllSportWears(){
        return sportWearMap.values();
    }

}

