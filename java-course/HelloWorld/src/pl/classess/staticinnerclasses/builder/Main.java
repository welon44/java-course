package pl.classess.staticinnerclasses.builder;

public class Main {
    public static void main(String[] args) {

        Bike bike = new Bike.BikeBuilder("red", "kolarka", true).build();
        System.out.println(bike);

        Bike bike2 = Bike.builder().setType("góral").build();
        System.out.println(bike2);

    }
}
