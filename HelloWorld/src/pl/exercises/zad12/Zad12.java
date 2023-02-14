package pl.exercises.zad12;

public class Zad12 {

    void countSpaces(String text) {

        int spaceCount = 0;
        String[] textArray = text.split("");

        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].equals(" ")) {
                spaceCount++;
            }
        }

        float result = 100f * spaceCount / textArray.length;

        System.out.println("space count " + spaceCount);
        System.out.println("text length " + textArray.length);
        System.out.println("result " + result  + "%");



    }
}
