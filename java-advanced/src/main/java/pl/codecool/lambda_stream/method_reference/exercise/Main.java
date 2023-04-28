package pl.codecool.lambda_stream.method_reference.exercise;

public class Main {

    public static void main(String[] args) {

        ReferenceUtils referenceUtils = new ReferenceUtils();

        System.out.println("Liczby parzyste: " + referenceUtils.getEventList());
        System.out.println("Posortowane po długosci od najkrótszego: " + referenceUtils.sortByLength());
        System.out.println("Suma liczb z listy: " + referenceUtils.getSum());
        System.out.println("Maksymalna liczba z listy: " + referenceUtils.getMaxNumberFromList());

    }
}
