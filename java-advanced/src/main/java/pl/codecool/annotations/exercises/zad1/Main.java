package pl.codecool.annotations.exercises.zad1;

@AnnotationFirst(name = "Annotation first name", size = 20)
@AnnotationSecond(value = "Annotation second value", name = "Annotation second name", size = 55)
@AnnotationThird(name = "Annotation third name", size = 44)
public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        @SuppressWarnings("all")
        AnnotationFirst annotationFirst = main.getClass().getAnnotation(AnnotationFirst.class);
        AnnotationSecond annotationSecond = main.getClass().getAnnotation(AnnotationSecond.class);
        @SuppressWarnings("all")
        AnnotationThird annotationThird = main.getClass().getAnnotation(AnnotationThird.class);

        System.out.println("annotationFirst: " + annotationFirst);
        System.out.println("==============");
        System.out.println("annotationSecond: " + annotationSecond);
        System.out.println("annotationSecondName: " + annotationSecond.name());
        System.out.println("annotationSecondValue: " + annotationSecond.value());
        System.out.println("annotationSecondSize: " + annotationSecond.size());
        System.out.println("==============");
        System.out.println("annotationThird: " + annotationThird);
        System.out.println("==============");
        System.out.println("MainGetClass: " + main.getClass().getName());
    }
}
