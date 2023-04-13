package pl.codecool.homework.zad5;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Cat{Imię: " + this.getName() + ", Wiek: " + this.getAge() + "}";
    }
}
