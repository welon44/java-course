package pl.codecool.lambda_stream.lambda.exercises.zad1;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        Predicate<String> stringPredicate = string -> string.length() > 5;
        System.out.println(stringPredicate.test("Warszawa"));

        Supplier<String> stringSupplier = () -> "Duda to debil";
        System.out.println(stringSupplier.get());

        Consumer<Integer> integerConsumer = integer -> {
            if (integer > 0) {
                System.out.println("Integer większy od zera");
            } else {
                System.out.println("Integer mniejszy od zera od zera");
            }
        };

        integerConsumer.accept(2);

        Function<Integer, String> intToString = integer -> "+++" + integer.toString() + "+++";

        System.out.println("Function: " + intToString.apply(2));

        UnaryOperator<String> stringUnaryOperator = s -> s.concat(s);
        System.out.println(stringUnaryOperator.apply("test"));

        BiConsumer<Integer, Integer> eligibility = (Integer age, Integer percentage) -> {
            if (age > 14 && percentage > 75)
                System.out.println("You're eligible to participate in school elections");
            else
                System.out.println("The eligibility criteria is Age > 14 and Percentage > 75");
        };

        eligibility.accept(16, 89);
    }
}
