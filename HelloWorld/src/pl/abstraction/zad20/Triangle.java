package pl.abstraction.zad20;

public class Triangle extends Shape {

    private int a;
    private int b;
    private int c;
    private int h;

    Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double calculatePerimeter() {

        return getA() + getB() + getC();
    }

    @Override
    public double calculateArea() {

        return (double) getA()/2 * getH();

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
