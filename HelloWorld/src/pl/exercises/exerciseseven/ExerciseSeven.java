package pl.exercises.exerciseseven;

import java.math.BigInteger;

public class ExerciseSeven {

    private static BigInteger TWO = BigInteger.valueOf(2);

    public static BigInteger fibonacci(BigInteger number) {
        if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE)) {
            return number;
        } else {
            return fibonacci(number.subtract(BigInteger.ONE)).add(
                    fibonacci(number.subtract(TWO))
            );

        }
    }
}
