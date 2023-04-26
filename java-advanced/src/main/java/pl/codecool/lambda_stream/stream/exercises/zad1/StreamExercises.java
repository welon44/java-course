package pl.codecool.lambda_stream.stream.exercises.zad1;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExercises {

    public Double getAverage(List<Integer> list) {

        return list.stream().mapToDouble(i -> i).average().orElse(0.0);
    }

    public List<String> convertToUppercase(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public List<String> findAllWordsStartsWithAAndWithSizeThree(List<String> list) {
        return list.stream()
                .map(String::toLowerCase)
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
    }

    public String getStreamWithCommas(List<Integer> list) {
        return list.stream()
                .map(number -> number % 2 == 0 ? "e".concat(number.toString()) : "o".concat(number.toString()))
                .collect(Collectors.joining(","));
    }
}
