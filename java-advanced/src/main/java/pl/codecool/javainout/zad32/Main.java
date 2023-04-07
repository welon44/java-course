package pl.codecool.javainout.zad32;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Car car1 = new Car("Opel", "Astra", "Red");
        Car car2 = new Car("Honda", "Civic", "White");

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        Zad32 zad32 = new Zad32(carList);
        zad32.saveObjectToFile();
        var cars = zad32.readObjectFromFile();

        cars.forEach(car -> System.out.printf("Marka: %s, Model: %s, Kolor: %s\n", car.getBrand(), car.getModel(), car.getColor()));
    }
}
