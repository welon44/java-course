package pl.codecool.javainout.zad32;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Car implements Serializable {

    private String brand;
    private String model;
    private String color;
}
