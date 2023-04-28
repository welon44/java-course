package pl.codecool.lambda_stream.collection.exercises.zad1;

public class Main {

    public static void main(String[] args) {

        Zad1 zad1 = new Zad1();
//        zad1.createLanguageMap().forEach((country, language) ->
//                                                 System.out.printf("Państwo: %s, język urzędowy: %s\n", country, language));

        zad1.createLanguageMap();
    }
}
