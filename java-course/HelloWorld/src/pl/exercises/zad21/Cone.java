package pl.exercises.zad21;

public class Cone extends ThreeDeeShape {
    private int radius;
    private int h;
    private double l;

    Cone(int radius, int h) {
        this.radius = radius;
        this.h = h;
    }
    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) / 3;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        setL(Math.sqrt(Math.pow(radius, 2) + Math.pow(h, 2)));
        return Math.PI * radius * getL();
    }

    public int getRadius() {
        return radius;
    }

    public int getH() {
        return h;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getL() {
        return l;
    }
}
