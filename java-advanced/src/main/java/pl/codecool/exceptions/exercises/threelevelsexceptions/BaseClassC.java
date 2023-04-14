package pl.codecool.exceptions.exercises.threelevelsexceptions;

public class BaseClassC extends BaseClassB {

    public void throwException() throws Exception {
        throw new Exception("Błąd z klasy bazowej C");
    }
}
