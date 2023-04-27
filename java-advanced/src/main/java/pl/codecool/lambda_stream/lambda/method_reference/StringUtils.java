package pl.codecool.lambda_stream.lambda.method_reference;

public class StringUtils {

    public static String toUpper(String s) {
        return s.toUpperCase();
    }

    public StringUtils toUpperObject(StringUtils s) {
        return s;
    }
}
