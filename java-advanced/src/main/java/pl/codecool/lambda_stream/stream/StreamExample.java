package pl.codecool.lambda_stream.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<String> listString = new ArrayList<>();

        listString.add("Test4");
        listString.add("Test2");
        listString.add("Test3");
        var result = listString.stream()
                .peek(s -> System.out.println("dupa"))
                .filter(s -> s.length() > 4)
                .map(s -> s.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
