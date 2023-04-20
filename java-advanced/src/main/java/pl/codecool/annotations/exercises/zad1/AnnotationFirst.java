package pl.codecool.annotations.exercises.zad1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface AnnotationFirst {

    String value() default "Default String";

    String name();

    int size();
}
