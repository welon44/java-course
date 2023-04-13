package pl.codecool.homework.zad5;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dog{Imię: " + this.getName() + ", Wiek: " + this.getAge() + "}";
    }
}
