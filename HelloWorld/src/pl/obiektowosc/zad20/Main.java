package pl.obiektowosc.zad20;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(5, 5, 5, 5);
        System.out.println("TRÓJKĄT");
        System.out.println("Obwód: " + triangle.calculatePerimeter());
        System.out.println("Pole: " + triangle.calculateArea());

        Hexagon hexagon = new Hexagon(5);
        System.out.println("SZEŚCIOKĄT");
        System.out.println("Obwód: " + hexagon.calculatePerimeter());
        System.out.println("Pole: " + hexagon.calculateArea());

        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("PROSTOKĄT");
        System.out.println("Obwód: " + rectangle.calculatePerimeter());
        System.out.println("Pole: " + rectangle.calculateArea());
    }
}
