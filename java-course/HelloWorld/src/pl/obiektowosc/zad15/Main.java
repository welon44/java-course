package pl.obiektowosc.zad15;

import pl.exercises.zad15.Car;

public class Main {
    public static void main(String[] args) {

        System.out.println("Toyota jest szybsza od BMW? " + Car.TOYOTA.isFasterThan(Car.BMW));
        System.out.println("BMW jest szybsze od TOYOTY? " + Car.BMW.isFasterThan(Car.TOYOTA));
        System.out.println("BMW is regular? " + Car.BMW.isRegular());
        System.out.println("BMW is Premium? " + Car.BMW.isPremium());
    }
}
