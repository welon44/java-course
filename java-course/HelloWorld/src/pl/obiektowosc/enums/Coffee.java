package pl.obiektowosc.enums;

public enum Coffee {

    ESPRESSO(0, Roast.DARK),
    LATTE(20, Roast.BLONDE),
    CAPPUCCINO(10, Roast.MEDIUM);

    private final int milk;
    private final Roast roast;

    Coffee(int milk, Roast roast) {
        this.milk = milk;
        this.roast = roast;
    }

    public int getMilk() {
        return milk;
    }

    public Roast getRoast() {
        return roast;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "milk=" + milk +
                ", roast=" + roast +
                '}';
    }
}
