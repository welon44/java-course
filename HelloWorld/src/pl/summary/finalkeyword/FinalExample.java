package pl.summary.finalkeyword;

public class FinalExample {

    public static final String MY_CONSTANT = "My constant";
    public final String myFinalField = getString();

    public FinalExample(String myFinalField) {
//        this.myFinalField = myFinalField;
    }

    public static String getString() {
        return "Hello";
    }

    public final void print() {
        System.out.println("Nie mozna nadpisać tej metody.");
    }
}
