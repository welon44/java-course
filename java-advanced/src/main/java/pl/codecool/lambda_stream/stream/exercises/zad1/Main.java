package pl.codecool.lambda_stream.stream.exercises.zad1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(7);

        List<String> stringList = new ArrayList<>();
        stringList.add("asasas");
        stringList.add("afadaf");
        stringList.add("ahgdgdgd");
        stringList.add("aryryy");
        stringList.add("Ala");
        stringList.add("Ada");
        stringList.add("ara");

        StreamExercises streamExercises = new StreamExercises();

        System.out.println("Średnia: " + streamExercises.getAverage(integerList));
        System.out.println("Konwertuj na wielkie litery: " + streamExercises.convertToUppercase(stringList));
        System.out.println("Słowa zaczynające się na i mające 3 litery: " + streamExercises.findAllWordsStartsWithAAndWithSizeThree(stringList));
        System.out.println("Stream with commas: " + streamExercises.getStreamWithCommas(integerList));


    }
}
