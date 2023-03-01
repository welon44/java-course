package pl.exercises.zad13;

public class Zad13 {

    void extractWords(String text) {
        String[] array = text.split(" ");

        for (int i = 0; i < array.length; i++) {
            String stringToRepeat = array[i] + " ";
            System.out.print(stringToRepeat.repeat(2));
        }

    }
}
