package pl.solid.zad3_liskov_substitution_principle;

public class Main {

    private static Rectangle getNewRectangle() {
        return new Square();
    }

    public static void main(String[] args) {

        Rectangle rectangle = Main.getNewRectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);

        System.out.println(rectangle.getArea());
    }
}
