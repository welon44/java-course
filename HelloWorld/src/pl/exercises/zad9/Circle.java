package pl.exercises.zad9;

import pl.exercises.zad10.MoveDirection;
import pl.exercises.zad10.Moveable;
import pl.exercises.zad11.Resizable;

public class Circle implements Moveable, Resizable {

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

    @Override
    public void resize(double resizeFactor) {
        double resizedPointX = center.getX() + ((point.getX() - center.getX()) * resizeFactor);
        double resizedPointY = center.getY() + ((point.getY() - center.getY()) * resizeFactor);

        point.setX(resizedPointX);
        point.setY(resizedPointY);
    }
}
