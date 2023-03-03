package pl.obiektowosc.zad9;
//https://journey.study/v2/learn/courses/7203/modules/20602/units/9/materials/28013

public class Main {
    public static void main(String[] args) {

        Point2D center = new Point2D(0,0);
        Point2D point = new Point2D(3, 4);

        Circle circle1 = new Circle(center, point);

        System.out.println("Promień: " + circle1.calculateRadius());
        System.out.println("Obwód: " + circle1.calculateCircumference());
        System.out.println("Pole: " + circle1.calculateArea());
    }
}
