package pl.exercises.zad19;

import java.util.Objects;
import pl.exercises.zad18.Computer;

public class Laptop extends Computer {

    private String battery;

    public Laptop(String processor, int memory, String graphics, String company, String model, String battery) {
        super(processor, memory, graphics, company, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Laptop laptop = (Laptop) o;
        return Objects.equals(battery, laptop.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                super.toString() +
                "battery='" + battery + '\'' +
                '}';
    }
}
