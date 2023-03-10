package pl.classess.localclassess.zad1;

public class Main {

    public static void main(String[] args) {

        UserValidator userValidator = new UserValidator();

        userValidator.validateEmails("testtest.pl", "test@test.pl");
    }
}
