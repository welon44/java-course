package pl.classess.innerclassess;


public class Main {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        outerClass.printFieldOuterClass();
        innerClass.printFieldInnerClass();
    }
}
