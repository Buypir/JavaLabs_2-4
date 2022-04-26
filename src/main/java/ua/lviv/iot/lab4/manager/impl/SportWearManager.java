package ua.lviv.iot.lab2.manager.impl;

import ua.lviv.iot.lab2.manager.ISportWearManager;
import ua.lviv.iot.lab2.models.SportWear;

import java.util.*;

public class SportWearManager implements ISportWearManager {
    private Map<Double, List<SportWear>> sportWearMap = new HashMap<>();
    @Override
    public void addWears(List<SportWear> sportWears) {
        sportWears.forEach(sportWear -> {
            double price = sportWear.getPriceInUah();
            var existingWear = sportWearMap.get(price);
            if(existingWear == null) {
                existingWear = new LinkedList<SportWear>();
                sportWearMap.put(price, existingWear);
            }
            existingWear.add(sportWear);
        });

    }

    @Override
    public SportWear findByPrice(List<SportWear> sportWears, double price) {
        for(SportWear sportWear : sportWears) {
            if(sportWear.getPriceInUah()==price) {
                return sportWear;
            }


        }
        System.out.print("There is no product with this Price\n");
        return null;
    }

    @Override
    public SportWear findByBrand(List<SportWear> sportWears, String brand) {
        for(SportWear sportWear : sportWears) {
            if(sportWear.getBrand().equals(brand)) {
                return sportWear;
            }

        }
        System.out.print("There is no product with this Brand\n");
        return null;
    }

    @Override
    public void sortByPercentageOfCotton(List<SportWear> sportWears, boolean reversed) {
        if(reversed)
            sportWears.sort(Collections.reverseOrder(Comparator.comparing(SportWear::getPercentageOfCotton)));
        else
            sportWears.sort(Comparator.comparing(SportWear::getPercentageOfCotton));
    }

}
