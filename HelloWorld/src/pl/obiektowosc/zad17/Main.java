package pl.obiektowosc.zad17;

public class Main {
    public static void main(String[] args) {
        MeasurementConverter measurementConverter = new MeasurementConverter();

        for (ConversionType conversionType : ConversionType.values()) {
            System.out.println(conversionType.name() + " " + measurementConverter.convert(conversionType, 2));
        }
    }
}
