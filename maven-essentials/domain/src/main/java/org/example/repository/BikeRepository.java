package org.example.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.example.domain.Bike;
import org.example.domain.BikeTechnicalData;

public class BikeRepository {

    static List<Bike> bikes = new ArrayList<>();

    static {
        bikes.add(new Bike(1, "Kuota", "Kobalt Carbon", 6000, new BikeTechnicalData("Dura Ace", "Disc", "red")));
        bikes.add(new Bike(2, "Pinarello", "Dogma F12", 10000, new BikeTechnicalData("Dura Ace", "Disc", "red")));
        bikes.add(new Bike(3, "Campagnolo", "Dark", 14000, new BikeTechnicalData("Dura Ace", "Disc", "red")));
    }

    public List<Bike> getAllBikes() {
        return bikes;
    }

    public Bike addBike(Bike bike) {
        bikes.add(bike);
        return bike;
    }

    public void removeBikeById(int id) {
        List<Bike> bikesToRemove = new ArrayList<>();
        bikes.forEach(bike -> {
            if (bike.getId() == id) {
                bikesToRemove.add(bike);
            }
        });

        bikes.removeAll(bikesToRemove);
    }

    public List<Bike> findBikeByBrand(String brand) {
        return bikes.stream().filter(bike -> bike.getBrand().equals(brand)).collect(Collectors.toList());
    }

    public List<Bike> findBikeByModel(String model) {
        return bikes.stream().filter(bike -> bike.getModel().equals(model)).collect(Collectors.toList());
    }
}
