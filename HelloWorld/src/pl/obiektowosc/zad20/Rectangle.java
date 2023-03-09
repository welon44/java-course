package pl.obiektowosc.zad20;

public class Rectangle extends Shape {

    private int a;
    private int b;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * getA() + 2 * getB();
    }

    @Override
    public double calculateArea() {
        return getA() * getB();
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
