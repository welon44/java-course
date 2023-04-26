package pl.codecool.lambda_stream.stream.exercises.zad10;

import java.time.LocalDate;

public interface Product {

    double getPrice();

    boolean productAvailibility(LocalDate localDate);
}
