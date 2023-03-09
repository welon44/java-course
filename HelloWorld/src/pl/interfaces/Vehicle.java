package pl.interfaces;

public interface Vehicle {

    // public static final
    int size = 5;

    void drive(int speed);
    void stop();

    default void someDefaultMethod() {
        int result = size + 5;
        System.out.println("My default method" + result);
    }

    static int someStaticMethod() {
        return size;
    }
}
