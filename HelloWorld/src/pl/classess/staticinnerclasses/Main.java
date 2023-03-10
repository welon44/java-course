package pl.classess.staticinnerclasses;

public class Main {
    public static void main(String[] args) {
        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();

        innerStaticClass.printInnerClass();
        OuterClass.InnerStaticClass.staticPrintInnerClass();
    }
}
