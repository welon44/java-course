package pl.codecool.exceptions.examples;

import java.io.IOException;

public class MyAutoCloseable implements AutoCloseable {

    @Override
    public void close() throws IOException {
        throw new IOException("Błąd podczas zamykania");
    }
}
