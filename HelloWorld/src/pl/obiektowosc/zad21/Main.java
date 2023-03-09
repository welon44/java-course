package pl.obiektowosc.zad21;

public class Main {
    public static void main(String[] args) {

        Cube cube = new Cube(5);
        Cone cone = new Cone(5, 10);

        System.out.println("SZEŚCIAN");
        System.out.println("Objętość: " + cube.calculateVolume());
        System.out.println("Obwód: " + cube.calculatePerimeter());
        System.out.println("Pole: " + cube.calculateArea());
        cube.fill(100);
        System.out.println("=================");
        System.out.println("STOŻEK");
        System.out.println("Objętość: " + cone.calculateVolume());
        System.out.println("Obwód: " + cone.calculatePerimeter());
        System.out.println("Pole: " + cone.calculateArea());
        System.out.println("\n");
        cone.fill(150);
    }
}
