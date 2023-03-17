package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter

public class Bike {

    private int id;
    private String brand;
    private String model;
    private int price;
    private BikeTechnicalData bikeTechnicalData;

}
