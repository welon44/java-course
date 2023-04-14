package pl.codecool.exceptions.exercises.finallyexercise;

public class CloseExampleExercise implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("Bład podczas zamykania");
    }
}
