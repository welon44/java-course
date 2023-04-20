package pl.codecool.regular_expressions.homework.zad7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad7 {

    private static final String URL_REGEX = "https?:\\/\\/(?:www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b(?:[-a-zA-Z0-9()@:%_\\+.~#?&\\/=]*)$";

    public boolean isCorrectUrl(String url) {

        Pattern pattern = Pattern.compile(URL_REGEX);
        Matcher matcher = pattern.matcher(url);
        System.out.println(matcher.matches());

        var result = matcher.matches();

        if (result) {
            System.out.println("Pasuje");
        } else {
            System.out.println("Nie pasuje");
        }

        return result;
    }
}
