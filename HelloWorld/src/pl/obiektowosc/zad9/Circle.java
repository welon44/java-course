package pl.obiektowosc.zad9;

import pl.obiektowosc.zad10.MoveDirection;
import pl.obiektowosc.zad10.Moveable;

public class Circle implements Moveable {

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    double calculateRadius() {
        return Math.sqrt(Math.pow((point.getX()-center.getX()),2) + Math.pow((point.getY()-center.getY()),2));
    }

    double calculateCircumference() {
        return 2 * Math.PI * calculateRadius();
    }

    double calculateArea() {
        return Math.PI * Math.sqrt(calculateRadius());
    }

    public Point2D getCenter() {
        return center;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public Point2D getPoint() {
        return point;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", point=" + point +
                '}';
    }
}
