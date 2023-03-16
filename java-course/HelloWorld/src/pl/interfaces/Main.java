package pl.interfaces;

public class Main {
    public static void main(String[] args) {

        Vehicle myBike = new Bike();
        myBike.drive(100);
        myBike.stop();
        myBike.someDefaultMethod();
    }
}
