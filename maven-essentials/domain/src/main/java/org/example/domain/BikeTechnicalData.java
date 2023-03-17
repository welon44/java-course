package org.example.domain;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class BikeTechnicalData {

    private String equipment;
    private String brakes;
    private String color;

}
