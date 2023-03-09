package pl.abstraction.zad21;

public class Cone extends ThreeDeeShape {
    private int radius;
    private int h;

    Cone(int radius, int h) {
        this.radius = radius;
        this.h = h;
    }
    @Override
    public double calculateVolume() {
        return (double) getRadius() * getH() / 3;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    public int getRadius() {
        return radius;
    }

    public int getH() {
        return h;
    }
}
