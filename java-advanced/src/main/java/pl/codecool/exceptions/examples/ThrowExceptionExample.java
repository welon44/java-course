package pl.codecool.exceptions.examples;

public class ThrowExceptionExample {

    public static int throwException(int[] array, int index) throws IndexOutOfBoundsException {

        return array[index];
    }
}
