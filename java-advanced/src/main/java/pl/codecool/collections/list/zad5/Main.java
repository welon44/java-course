package pl.codecool.collections.list.zad5;

public class Main {

    public static void calculateExpression(String expression, Stos<String> stos) {
        String[] symbols = expression.split("");

        boolean isNewElement = false;

        for (String symbol : symbols) {
            if (isNewElement) {
                stos.push(symbol);
                isNewElement = false;
            } else if (symbol.equals("+")) {
                isNewElement = true;
            } else if (symbol.equals("-")) {
                System.out.printf("Printed from stack %s\n", stos.pop());
            } else {
                System.out.println("Incorrect symbol. Nothing happened");
            }
        }
    }

    public static void main(String[] args) {

        Stos stos = new Stos();

        String EXPRESSION = "+B+a+ł---+a+g+a---+n-+w-+l+i+t---+e-+r+k--+a+c+h---";

        calculateExpression(EXPRESSION, stos);
    }
}
