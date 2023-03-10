package pl.classess.innerclassess.zad6;

import java.util.HashSet;
import java.util.Set;

public class Zoo {

    Set<Animal> animals = new HashSet<>();

    public class Animal {
        private final String name;
        private final String species;
        private final int age;

        public Animal(String name, String species, int age) {
            this.name = name;
            this.species = species;
            this.age = age;
        }


        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", species='" + species + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }

}
