package pl.codecool.regular_expressions.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApiExample {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[abc]");
        Matcher matcher = pattern.matcher("abc");

        System.out.println("matches " + matcher.matches());

        System.out.println("find " + matcher.find());
        System.out.println("start " + matcher.start());
        System.out.println("end " + matcher.end());
        System.out.println("group " + matcher.group());

    }
}
