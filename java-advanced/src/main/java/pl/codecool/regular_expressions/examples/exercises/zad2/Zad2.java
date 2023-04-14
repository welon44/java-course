package pl.codecool.regular_expressions.examples.exercises.zad2;

import java.util.regex.Pattern;

public class Zad2 {

    public String findAndReplace(String string) {

        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);

        var condition = pattern.matcher(string).find();

        String newString = null;

        if (condition) {
            newString = string.replaceAll("java", "python");
        }

        return newString;
    }
}
