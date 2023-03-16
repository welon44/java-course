package pl.interfaces;

public class Bike implements Vehicle {
    @Override
    public void drive(int speed) {
        System.out.println("My bike is riding " + speed);
    }

    @Override
    public void stop() {
        System.out.println("My bike stopped.");
    }
}
