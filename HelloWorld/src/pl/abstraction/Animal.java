package pl.abstraction;

public abstract class Animal {

    private String latinName;

    public Animal(String latinName) {
        this.latinName = latinName;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public abstract void giveVoice();
}
