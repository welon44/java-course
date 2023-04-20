package pl.codecool.annotations.exercises.zad3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        Bike bike = new Bike("Merida", 5);

        System.out.println("ANNOTATIONS");
        for (Annotation annotation : bike.getClass().getAnnotations()) {
            System.out.println(annotation);
        }
        System.out.println("===========");

        System.out.println("CONSTRUCTORS");
        for (Constructor<?> constructor : bike.getClass().getConstructors()) {
            System.out.println(constructor);
        }

        System.out.println("METHODS");
        for (Method method : bike.getClass().getMethods()) {
            System.out.println(method);
        }
    }
}
