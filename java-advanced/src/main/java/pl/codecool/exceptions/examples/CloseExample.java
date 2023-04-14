package pl.codecool.exceptions.examples;

public class CloseExample implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("Bład podczas zamykania");
    }
}
