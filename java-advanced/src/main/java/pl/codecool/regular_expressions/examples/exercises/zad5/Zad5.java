package pl.codecool.regular_expressions.examples.exercises.zad5;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad5 {

    public List<String> findPhoneNumbers(String string) {

        Pattern PHONE_NUMBER_PATTERN = Pattern.compile("\\+[0-9]{2}\\s[0-9]{3}-[0-9]{3}-[0-9]{3}");

        Matcher countPhoneMatcher = PHONE_NUMBER_PATTERN.matcher(string);

        List<String> phoneNumbers = new ArrayList<>();

        while (countPhoneMatcher.find()) {
            phoneNumbers.add(countPhoneMatcher.group());
        }

        return phoneNumbers;

    }
}
