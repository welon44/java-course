package pl.classess.localclassess.zad4;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        //klasa anonimowa, nie ma nazwy
        Validator nameValidator = new Validator() {
            @Override
            public boolean validate(String input) {
                return !input.isBlank() && !input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        };

        Validator loginValidator = new Validator() {
            @Override
            public boolean validate(String input) {
                return input.length() == 10;
            }
        };

        Validator passwordValidator = new Validator() {
            @Override
            public boolean validate(String input) {
                return input.contains("!");
            }
        };

        user.setFirstName("Welon", nameValidator);
        System.out.println(user.getFirstName());
        user.setLastName("Welon", nameValidator);
        System.out.println(user.getLastName());
        user.setLogin("welon", loginValidator);
        System.out.println(user.getLogin());
        user.setPassword("&^!067", passwordValidator);
        System.out.println(user.getPassword());

    }
}
