package pl.exercises.zad17;

public enum ConversionType {

    METERS_TO_YARDS(1),
    YARDS_TO_METERS(2),
    CENTIMETERS_TO_ICHES(3),
    INCHES_TO_CENTIMETERS(4),
    KILOMETERS_TO_MILES(5),
    MILES_TO_KILOMETERS(6);

    private final double value;

    ConversionType(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.toString();
    }
}
