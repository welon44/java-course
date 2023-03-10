package pl.classess.innerclassess.zad6;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Zoo.Animal monkey = zoo.new Animal("Wacław", "małpa", 5);
        Zoo.Animal lion = zoo.new Animal("Mufasa", "lew", 4);
        Zoo.Animal elephant = zoo.new Animal("Bambo", "słoń", 3);

        zoo.addAnimal(monkey);
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);

        zoo.getAnimals().forEach(System.out::println);

        zoo.removeAnimal(lion);

        System.out.println("===================");

        zoo.getAnimals().forEach(System.out::println);
    }
}
