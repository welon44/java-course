package pl.summary.statickeyword;

import pl.summary.accessmodificators.Modificators;

public class StaticExample {

    public static int number = 10;
    public static Modificators modificators;

    public static int getNumber() {
        return number;
    }

    //wykonuje sie na poczatku
    static {
        number = 100;
    }

    {
        Modificators modificators1 = new Modificators();
        modificators = modificators1;
        number = 20;
        getNumber();
        doSomething();
    }

    private void doSomething() {

    }
}
