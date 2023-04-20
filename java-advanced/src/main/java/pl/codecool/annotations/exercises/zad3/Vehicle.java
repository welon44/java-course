package pl.codecool.annotations.exercises.zad3;

import pl.codecool.annotations.exercises.zad2.TargetAnnotationZad2;

@TargetAnnotationZad2(value = "person class")
public class Vehicle {

    private String name;
    private int size;

    @TargetAnnotation(value = "constructor with 2 parameters")
    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @TargetAnnotation(value = "get name method")
    public String getName() {
        return name;
    }

    @TargetAnnotation(value = "get size method")
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
