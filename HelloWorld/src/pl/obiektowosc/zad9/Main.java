package pl.exercises.zad9;
//https://journey.study/v2/learn/courses/7203/modules/20602/units/9/materials/28013

import pl.exercises.zad10.MoveDirection;

public class Main {
    public static void main(String[] args) {

        Point2D center = new Point2D(0,0);
        Point2D point = new Point2D(3, 4);

        Circle circle1 = new Circle(center, point);

        System.out.println("Promień: " + circle1.calculateRadius());
        System.out.println("Obwód: " + circle1.calculateCircumference());
        System.out.println("Pole: " + circle1.calculateArea());

        System.out.println("PUNKTY: " + circle1);

        circle1.move(new MoveDirection(2, 2));

        System.out.println("Nowy promień: " + circle1.calculateRadius());
        System.out.println("Nowy obwód: " + circle1.calculateCircumference());
        System.out.println("Nowe pole: " + circle1.calculateArea());

        System.out.println("NOWE PUNKTY: " + circle1);

        circle1.resize(2d);

        System.out.println("NOWE PUNKTY PO RESIZE: " + circle1);
        System.out.println("Nowy promień po resize: " + circle1.calculateRadius());
        System.out.println("Nowy obwód po resize: " + circle1.calculateCircumference());
        System.out.println("Nowe pole po resize: " + circle1.calculateArea());

    }
}
