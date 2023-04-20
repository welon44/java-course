package pl.codecool.annotations.exercises.zad2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        System.out.println("Person class");
        for (Annotation annotation : Person.class.getAnnotations()) {
            System.out.println(annotation);
        }
        System.out.println("===========");

        System.out.println("Constructors");
        for (Constructor<?> constructor : Person.class.getConstructors()) {
            System.out.println("Constructor: " + constructor);
            System.out.println("Constructor annotations: " + constructor.getAnnotation(TargetAnnotationZad2.class));
        }
        System.out.println("===========");

        System.out.println("Fields");
        for (Field field : Person.class.getDeclaredFields()) {
            System.out.println("Field: " + field.getName());
            System.out.println("Field annotation: " + field.getAnnotation(TargetAnnotationZad2.class));
        }
        System.out.println("===========");

        System.out.println("Methods");
        for (Method method : Person.class.getMethods()) {
            System.out.println("Method: " + method.getName());
            System.out.println("Method annotation: " + method.getAnnotation(TargetAnnotationZad2.class));
        }

    }
}
