package pl.codecool.annotations.exercises.zad3;

import java.lang.annotation.*;

@Inherited()
@Repeatable(TargetAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface TargetAnnotation {

    String value();
}
