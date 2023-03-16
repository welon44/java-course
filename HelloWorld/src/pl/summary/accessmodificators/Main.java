package pl.summary.accessmodificators;

public class Main {
    public static void main(String[] args) {
        Modificators modificators = new Modificators();

        System.out.println(modificators.publicField);
        modificators.publicField = "new value public field";
        System.out.println(modificators.publicField);

        System.out.println(modificators.defaultField);
        System.out.println(modificators.protectedField);
    }
}
