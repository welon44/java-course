package pl.codecool.lambda_stream.optionals.exercises.zad2;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Zad2 zad2 = new Zad2();

        Optional<Integer> optionalInteger = Optional.of(7);
        Optional<Integer> optionalIntegerNullable = Optional.empty();

        Optional<String> optionalString = Optional.of("test");
        Optional<String> optionalStringNullable = Optional.empty();

        System.out.println(zad2.getSquare(optionalInteger));
        System.out.println(zad2.getSquare(optionalIntegerNullable));

        System.out.println(zad2.getLength(optionalString));
        System.out.println(zad2.getLength(optionalStringNullable));

        System.out.println(zad2.concat(optionalInteger, optionalString));
        System.out.println(zad2.concat(optionalIntegerNullable, optionalStringNullable));
    }
}
