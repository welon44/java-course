package pl.codecool.exceptions.exercises.threelevelsexceptions;

public class Main {

    public static void main(String[] args) throws Exception {

        BaseClassC baseClassC = new BaseClassC();

        ((BaseClassA) baseClassC).throwException();

    }
}
