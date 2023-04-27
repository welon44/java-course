package pl.codecool.lambda_stream.optionals;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        Optional<Integer> optionalInteger = Optional.ofNullable(null);

        System.out.println("NO VALUE");

        System.out.println(optionalInteger.isPresent());
        System.out.println(optionalInteger.isEmpty());
        System.out.println(optionalInteger.orElse(100));

        optionalInteger.ifPresent(i -> System.out.println(i));

        System.out.println("VALUE IS PRESENT");

        optionalInteger = Optional.ofNullable(17);

        System.out.println(optionalInteger.isPresent());
        System.out.println(optionalInteger.isEmpty());
        System.out.println(optionalInteger.orElse(100));

        optionalInteger.ifPresent(i -> System.out.println(i));
    }
}
