package pl.codecool.generics.examples;

public class Cup<T> {

    private T liquid;

    public Cup(T liquid) {
        this.liquid = liquid;
    }

    public void fillCup (T liquid) {
        this.liquid = liquid;
    }

    public T getLiquid() {
        return liquid;
    }
}
