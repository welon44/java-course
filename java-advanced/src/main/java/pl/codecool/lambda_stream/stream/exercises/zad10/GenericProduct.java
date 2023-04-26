package pl.codecool.lambda_stream.stream.exercises.zad10;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Supplier;

public class GenericProduct implements Product {

    private final Supplier<Double> supplier;
    private final Function<LocalDate, Boolean> function;

    public GenericProduct(Supplier<Double> supplier, Function<LocalDate, Boolean> function) {
        this.supplier = supplier;
        this.function = function;
    }

    @Override
    public String toString() {
        return "GenericProduct{" +
                "price=" + supplier.get() +
                ", productAvailibility=" + function.toString() +
                '}';
    }

    @Override
    public double getPrice() {
        return supplier.get();
    }

    @Override
    public boolean productAvailibility(LocalDate availibilityDate) {
        return function.apply(availibilityDate);
    }
}
