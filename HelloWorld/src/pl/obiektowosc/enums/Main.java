package pl.obiektowosc.enums;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Roast.BLONDE);
        Roast[] myEnums = Roast.values();

        for (Roast roast : myEnums) {
            System.out.println(roast);
        }

        Roast roast = Roast.valueOf("BLONDE");
        System.out.println("TEST " + roast);

//        Roast roast1 = Roast.valueOf("NIE MA");
//        System.out.println("TEST " + roast);

        System.out.println(Coffee.ESPRESSO.getMilk());
        System.out.println(Coffee.ESPRESSO);
    }
}
