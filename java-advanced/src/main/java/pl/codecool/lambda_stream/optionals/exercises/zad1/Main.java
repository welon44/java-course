package pl.codecool.lambda_stream.optionals.exercises.zad1;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Zad1 zad1 = new Zad1("Marcin", "Welenc");
        Zad1 newZad1 = new Zad1("test", "test");
        Zad1 emptyZad1 = new Zad1(null, null);
        Optional<Zad1> optionalZad1 = Optional.of(zad1);
        Optional<Zad1> newOptionalZad1 = Optional.ofNullable(emptyZad1);

        System.out.println("OBIEKT ISTNIEJE");
        System.out.println("--------------");
        System.out.println("get: " + optionalZad1.get());
        System.out.println("--------------");
        System.out.println("isPresent: " + optionalZad1.isPresent());
        System.out.println("--------------");
        System.out.println("isEmpty: " + optionalZad1.isEmpty());
        System.out.println("--------------");
        System.out.println("ifPresentOrElse");
        optionalZad1.ifPresentOrElse(value -> System.out.println("Value is present, its: " + value), () -> System.out.println("Value is empty"));
        System.out.println("--------------");
        System.out.println("filter: " + optionalZad1.filter(v -> v.getFirstName().equals("Marcin")));
        System.out.println("--------------");
        System.out.println("map: " + optionalZad1.map(v -> v.getFirstName().toUpperCase()));
        System.out.println("--------------");
        System.out.println("or: " + optionalZad1.or(() -> Optional.of(newZad1)));
        System.out.println("--------------");
        System.out.println("orElse: " + optionalZad1.orElse(newZad1));
        System.out.println("--------------");
        System.out.println("orElseGet: " + optionalZad1.orElseGet(() -> newZad1));
        System.out.println("--------------");
        System.out.println("orElseThrow: " + optionalZad1.orElseThrow(() -> new RuntimeException("Runtime exception")));

        System.out.println("OBIEKT NIE ISTNIEJE");
        optionalZad1 = newOptionalZad1;
        System.out.println("--------------");
        System.out.println("get: " + optionalZad1.get());
        System.out.println("--------------");
        System.out.println("isPresent: " + optionalZad1.isPresent());
        System.out.println("--------------");
        System.out.println("isEmpty: " + optionalZad1.isEmpty());
        System.out.println("--------------");
        System.out.println("ifPresentOrElse");
        optionalZad1.ifPresentOrElse(value -> System.out.println("Value is present, its: " + value), () -> System.out.println("Value is empty"));
        System.out.println("--------------");
        System.out.println("filter: " + optionalZad1.filter(v -> v.getFirstName() == null));
        System.out.println("--------------");
        System.out.println("map: " + optionalZad1.map(v -> new Zad1("Jan", "Kowalski")));
        System.out.println("--------------");
        System.out.println("or: " + optionalZad1.or(() -> Optional.of(newZad1)));
        System.out.println("--------------");
        System.out.println("orElse: " + optionalZad1.orElse(newZad1));
        System.out.println("--------------");
        System.out.println("orElseGet: " + optionalZad1.orElseGet(() -> newZad1));
        System.out.println("--------------");
        System.out.println("orElseThrow: " + optionalZad1.orElseThrow(() -> new RuntimeException("Runtime exception")));
    }
}
