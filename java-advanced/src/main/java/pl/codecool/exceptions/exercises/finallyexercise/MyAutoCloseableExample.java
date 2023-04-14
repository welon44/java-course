package pl.codecool.exceptions.exercises.finallyexercise;

import java.io.IOException;

public class MyAutoCloseableExample implements AutoCloseable {
    @Override
    public void close() throws IOException {
//        throw new IOException("Błąd podczas zamykania trututu");
    }
}
