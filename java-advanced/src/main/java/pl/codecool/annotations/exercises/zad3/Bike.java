package pl.codecool.annotations.exercises.zad3;

@TargetAnnotation(value = "bike")
public class Bike extends Vehicle {

    public Bike(String name, int size) {
        super(name, size);
    }
}
