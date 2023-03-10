package pl.classess.staticinnerclasses.zad2;

public class MyUtils {

    private static final String TEST_STRING = "Lorem ipsum dolores";

    public static class StringUtils {

        public String reverseString() {
            String newString = null;
            char ch;

            for (int i=0; i < TEST_STRING.length(); i++) {
                ch = TEST_STRING.charAt(i); //extracts each character
                newString = ch + newString;
            }

            return newString;
        }

        public String convertStringToUppercase() {
            return TEST_STRING.toUpperCase();
        }

        public String convertStringToLowercase() {
            return TEST_STRING.toLowerCase();
        }

    }
}
