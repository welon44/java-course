package pl.exercises.zad20;

public class Hexagon extends Shape {

    private final int a;

    Hexagon(int a) {
        this.a = a;
    }

    @Override
    public double calculatePerimeter() {
        return getA() * 6;
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3))/2 * Math.pow(getA(),2);
    }

    public int getA() {
        return a;
    }
}
