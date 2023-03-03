package pl.abstraction;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Azor", "Czesiek");

        dog.giveVoice();
        System.out.println(dog.getLatinName());

        Animal animal = dog;
        animal.giveVoice();

        Lion lion = new Lion("Mufasa", "walking", "yellow");
        lion.drink();
        lion.giveVoice();

        Mammal mammal = lion;
        mammal.drink();
        mammal.giveVoice();

        animal = lion;
        animal.giveVoice();

        animal = dog;
        animal.giveVoice();
    }
}
