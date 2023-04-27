package pl.codecool.lambda_stream.lambda.method_reference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReferenceExample {

    public static void main(String[] args) {

        BiFunction<Double, Double, Double> myFunc = Math::pow;

        StringUtils stringUtils = new StringUtils();

        myFunc = (x, y) -> Math.pow(x, y);

        //obiekt::metodaEgzemplarza = x -> metodaEgzemplarza(x);

        List<String> words = new ArrayList<>();
        words.add("test");
        words.add("test2");
        words.add("test");

        Stream<String> myStream = words.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER::compare);

//        myStream.sorted(String.CASE_INSENSITIVE_ORDER::compare);

        words.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER::compare)
                .collect(Collectors.toList());

        //Klasa::metodaStatyczna = x -> metodaStatyczna(x)
        List<StringUtils> stringUtilsList = new ArrayList<>();
        stringUtilsList.stream()
                .map(o -> o.toUpperObject(o))
                .collect(Collectors.toList());


        //Klasa::metoda egzemplarza
        //x -> x.metodaEgxemplarza
        //(x, y) -> x.metodaEgzemplarza(y)

        words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        words.stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        //OBJECT
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "John", 30));
        people.add(new Person(2, "Andy", 31));
        people.add(new Person(3, "Tom", 32));

        people.stream()
                .map(Person::getFirstName);

        people.stream()
                .sorted()
                .findFirst();

        //CONSTRUCTOR

        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("John");
        names.add("Eva");

        List<Person> myPeople = names.stream()
                .map(Person::new).collect(Collectors.toList());

        System.out.println("My PEOPLE " + myPeople);
    }
}
