package pl.abstraction;

public class Lion extends Mammal {

    private String color;

    public Lion(String latinName, String movementKind, String color) {
        super(latinName, movementKind);
        this.color = color;
    }

    @Override
    public void giveVoice() {
        System.out.println("WRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
    }

    @Override
    public void drink() {
        System.out.println("WATER");
    }
}
