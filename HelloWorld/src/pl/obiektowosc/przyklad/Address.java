package pl.obiektowosc.przyklad;

import java.util.Objects;

public class Address {

    private String streetName;
    private int houseNumber;
    private int flatNumber;
    private String city;

    //constructor
    public Address(String streetName, int houseNumber, int flatNumber, String city) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.city = city;
    }

    public Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    // getter
    public String getStreetName() {
        return streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public String getCity() {
        return city;
    }

    //setter
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return houseNumber == address.houseNumber && flatNumber == address.flatNumber && Objects.equals(streetName, address.streetName) && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetName, houseNumber, flatNumber, city);
    }

    public String toString() {
        return
                "Ulica: " + getStreetName() + "\n" +
                "Numer domu: " + getHouseNumber() + "\n" +
                "Numer mieszkania: " + getHouseNumber() + "\n" +
                "Miasto: " + getCity();
    }
}
