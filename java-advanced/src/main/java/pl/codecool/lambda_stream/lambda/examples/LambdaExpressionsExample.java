package pl.codecool.lambda_stream.lambda.examples;

public class LambdaExpressionsExample {

    public static void main(String[] args) {

        MyLambdaInterface myLambda = (s) -> {
            if (s.isEmpty()) {
                return 1;
            } else {
                return 0;
            }
        };
    }
}
