package pl.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateExample {
    public static void main(String[] args) {
        System.out.println("Local date: " + LocalDate.now());
        System.out.println("Local time: " + LocalTime.now());
        System.out.println("Local date time: " + LocalDateTime.now());

        System.out.println();

        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(55, 100));
        System.out.println(Math.abs(77));
        System.out.println(Math.ceil(3.55D));
        System.out.println(Math.floor(3.55D));
        System.out.println(Math.pow(2, 9));
        System.out.println(Math.random());
        System.out.println(Math.round(9.99D));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
}
