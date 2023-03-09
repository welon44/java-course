package pl.obiektowosc.zad21;

public class Cube extends ThreeDeeShape {

    private final int a;

    public Cube(int a) {
        this.a = a;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(getA(), 3);
    }

    public int getA() {
        return a;
    }

    @Override
    public double calculatePerimeter() {
        return 12 * getA();
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(getA(), 2);
    }

}
