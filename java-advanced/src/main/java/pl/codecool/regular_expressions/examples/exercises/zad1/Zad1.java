package pl.codecool.regular_expressions.examples.exercises.zad1;

import java.util.regex.Pattern;

public class Zad1 {

    public boolean containsJava(String string) {
        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);

        var result = pattern.matcher(string).find();

        if (result) {
            System.out.println("Zawiera słowo Java");
        } else {
            System.out.println("Nie zawiera słowa Java");
        }

        return result;

    }
}
