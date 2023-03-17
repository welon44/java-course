package org.example.domain;

import java.util.Objects;

public class BikeTechnicalData {

    private String equipment;
    private String brakes;
    private String color;

    public BikeTechnicalData(String equipment, String brakes, String color) {
        this.equipment = equipment;
        this.brakes = brakes;
        this.color = color;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getBrakes() {
        return brakes;
    }

    public void setBrakes(String brakes) {
        this.brakes = brakes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BikeTechnicalData that = (BikeTechnicalData) o;
        return Objects.equals(equipment, that.equipment) && Objects.equals(brakes, that.brakes) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(equipment, brakes, color);
    }

    @Override
    public String toString() {
        return "BikeTechnicalData{" +
                "equipment='" + equipment + '\'' +
                ", brakes='" + brakes + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
