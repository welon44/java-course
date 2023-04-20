package pl.codecool.annotations.examples;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@AnnotationExample(value = "Example", size = 20)
public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        AnnotationExample annotationExample = main.getClass().getAnnotation(AnnotationExample.class);

        System.out.println(annotationExample);
        System.out.println(main.getClass().getName());
        System.out.println(main.getClass().getSimpleName());
        System.out.println(main.getClass().getPackageName());

        System.out.println("My Object");

        for (Annotation annotation : MyObject.class.getAnnotations()) {
            System.out.println(annotation);
        }

        System.out.println("Fields");

        Class<MyObject> myObjectClass = MyObject.class;
        for (Field field : myObjectClass.getFields()) {
            System.out.println(field);
        }

        System.out.println("Methods");
        for (Method method : myObjectClass.getMethods()) {
            System.out.println(method);
        }

        System.out.println("Constructors");
        for (Constructor<?> declaredConstructor : myObjectClass.getDeclaredConstructors()) {
            System.out.println(declaredConstructor);
        }

    }
}
