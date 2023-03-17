package org.example.domain;

import java.util.Objects;

public class Bike {

    private int id;
    private String brand;
    private String model;
    private int price;
    private BikeTechnicalData bikeTechnicalData;

    public Bike(int id, String brand, String model, int price, BikeTechnicalData bikeTechnicalData) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.bikeTechnicalData = bikeTechnicalData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BikeTechnicalData getBikeTechnicalData() {
        return bikeTechnicalData;
    }

    public void setBikeTechnicalData(BikeTechnicalData bikeTechnicalData) {
        this.bikeTechnicalData = bikeTechnicalData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Bike bike = (Bike) o;
        return id == bike.id && price == bike.price && Objects.equals(brand, bike.brand) && Objects.equals(model, bike.model) && Objects.equals(bikeTechnicalData, bike.bikeTechnicalData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, price, bikeTechnicalData);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", bikeTechnicalData=" + bikeTechnicalData +
                '}';
    }
}
