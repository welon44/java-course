package pl.classess.innerclassess;

public class OuterClass {

    private final String outerClassField = "outer class field";

    public class InnerClass {

        private final String innerClassField = "inner class field";

        public void printFieldInnerClass() {
            System.out.println(outerClassField);
            System.out.println(innerClassField);
            printFieldOuterClass();
        }
    }

    public void printFieldOuterClass() {
        System.out.println(outerClassField);
    }

}
