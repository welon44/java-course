package pl.codecool.regular_expressions.examples.exercises.zad3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad3 {

    public int findAllEmails(String string) {

        Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile("([a-z0-9_.-]+)@([a-z0-9_.-]+[a-z])");

        Matcher countEmailMatcher = EMAIL_ADDRESS_PATTERN.matcher(string);

        int count = 0;
        while (countEmailMatcher.find()) {
            String newString = countEmailMatcher.group();

            if (newString != null) {
                System.out.println("Znaleziono: " + newString);
            }

            count++;
        }

        return count;
    }
}
