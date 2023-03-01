package pl.examples;

public class Conversion {
    public static void main(String[] args) {

        byte a = 127;
        byte b = (byte) 130;
        float c = 3.14F;

        int d = 5;
        byte e = (byte) d;
        long f = (long) c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        var test = Integer.valueOf(111);
        System.out.println("test " + test.hashCode());

    }
}
