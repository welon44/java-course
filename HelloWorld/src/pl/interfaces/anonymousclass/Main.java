package pl.interfaces.anonymousclass;

import java.util.function.Predicate;
import pl.interfaces.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle() {
            @Override
            public void drive(int speed) {

            }

            @Override
            public void stop() {

            }
        };

        System.out.println(vehicle.getClass().getName());

        Comparable<Integer> comparable = new Comparable<Integer>() {
            @Override
            public int compareTo(Integer o) {
                return 0;
            }
        };

        System.out.println(comparable.compareTo(0));

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 6;
            }
        };

        System.out.println(predicate.test("test"));
    }
}
