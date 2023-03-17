package org.example.controller;

public class Main {

    public static void main(String[] args) {

        BikeController bikeController = new BikeController();

        bikeController.removeBikeById(1);
        System.out.println("==============================");
        System.out.println(bikeController.getAllBikes());

    }
}
