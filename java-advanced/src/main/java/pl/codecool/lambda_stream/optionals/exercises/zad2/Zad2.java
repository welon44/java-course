package pl.codecool.lambda_stream.optionals.exercises.zad2;

import java.util.Optional;

public class Zad2 {

    public Integer getSquare(Optional<Integer> integerOptional) {
        return integerOptional.map(n -> n * n).orElse(0);
    }

    public Integer getLength(Optional<String> integerOptional) {
        return integerOptional.map(n -> n.length()).orElse(0);
    }

    public String concat(Optional<Integer> number, Optional<String> word) {
        return number.flatMap(i -> word.map(w -> i + w)).orElse("UNKNOWN");
    }
}
