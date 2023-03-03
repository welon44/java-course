package pl.abstraction;

public abstract class Mammal extends Animal {

    private String movementKind;

    public Mammal(String latinName, String movementKind) {
        super(latinName);
        this.movementKind = movementKind;
    }

    public abstract void drink();
}
