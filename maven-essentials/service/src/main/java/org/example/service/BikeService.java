package org.example.service;

import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.example.domain.Bike;
import org.example.repository.BikeRepository;

@Log4j2
public class BikeService {

    private BikeRepository bikeRepository = new BikeRepository();

    public List<Bike> getAllBikes() {
        return bikeRepository.getAllBikes();
    }

    public void addBike(Bike bike) {
        bikeRepository.addBike(bike);
    }

    public void removeBikeById(int id) {
        bikeRepository.removeBikeById(id);
    }

    public List<Bike> findBikeByBrand(String brand) {

        return bikeRepository.findBikeByBrand(brand);
    }

    public List<Bike> findBikeByModel(String model) {
        return bikeRepository.findBikeByModel(model);
    }

}
