package pl.codecool;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

        // deklaracja zmiennej a
        int a;

        //inicjalizacja zmiennej b
        int b = 5;

        a = 10;

        int c = a + b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int d = 10 / 3;

        System.out.println(d);

        long myLong = 10000000000L; // L jako typ Long - typ całkowity 8 bit
        float myFloat = 143.54433F; // 32 bity
        double myDouble = 14445.99973873837;
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);

        boolean myTrue = true;
        boolean myFalse = false;

        System.out.println(myTrue);
        System.out.println(myFalse);
        System.out.println(myFalse || myTrue); // suma logiczna OR
        System.out.println(myFalse && myTrue); // iloczyn
    }
}
