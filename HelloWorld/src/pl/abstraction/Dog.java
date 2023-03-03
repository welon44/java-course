package pl.abstraction;

public class Dog extends Animal {

    private String ownerName;

    public Dog(String latinName, String ownerName) {
        super(latinName);
        this.ownerName = ownerName;
    }

    @Override
    public void giveVoice() {
        System.out.println("Szczekaj psie kurła.");
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
