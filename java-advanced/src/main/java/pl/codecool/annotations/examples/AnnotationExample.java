package pl.codecool.annotations.examples;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD}) //określa gdzie mozna uzyc adnotacji
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationExample {

    String value() default "default";

    int size() default 0;
}
