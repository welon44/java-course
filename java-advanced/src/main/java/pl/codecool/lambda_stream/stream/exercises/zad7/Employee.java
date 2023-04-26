package pl.codecool.lambda_stream.stream.exercises.zad7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

}
