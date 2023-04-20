package pl.codecool.annotations.exercises.zad3;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited()
@Retention(RetentionPolicy.RUNTIME)
public @interface TargetAnnotations {

    TargetAnnotation[] value();
}
