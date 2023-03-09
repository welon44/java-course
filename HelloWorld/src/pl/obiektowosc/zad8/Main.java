package pl.obiektowosc.zad8;

public class Main {
    public static void main(String[] args) {
        Validator validator = new ValidatorImpl();
        Parcel parcel1 = new Parcel(30, 30, 30, 60, true);
        Parcel parcel2 = new Parcel(50, 50, 50, 70, true);
        Parcel parcel3 = new Parcel(40, 40, 40, 80, false);

        System.out.println("PARCEL 1");
        validator.validate(parcel1);
        System.out.println();
        System.out.println("=======================");
        System.out.println();
        System.out.println("PARCEL 2");
        validator.validate(parcel2);
        System.out.println();
        System.out.println("=======================");
        System.out.println();
        System.out.println("PARCEL 3");
        validator.validate(parcel3);
    }
}
