package pl.obiektowosc.zad9;

import pl.obiektowosc.zad10.MoveDirection;
import pl.obiektowosc.zad10.Moveable;

public class Point2D implements Moveable {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        setX(getX() + moveDirection.getX());
        setY(getY() + moveDirection.getY());
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
