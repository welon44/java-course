package pl.exercises.zad17;

public class MeasurementConverter {

    double convert(ConversionType conversionType, int valueToConvert) {
        return conversionType.getValue() * valueToConvert;
    }
}
