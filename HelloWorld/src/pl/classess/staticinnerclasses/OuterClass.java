package pl.classess.staticinnerclasses;

public class OuterClass {

    private static final String staticOuterClassField = "staticOuterClassField";
    private final String outerClassField = "outerClassField";

    public static class InnerStaticClass {

        private static final String staticInnerClassField = "staticInnerClassField";
        private final String innerClassField = "innerClassField";

        public void printInnerClass() {
            System.out.println(staticInnerClassField);
            System.out.println(innerClassField);
            System.out.println("From outer class" + staticOuterClassField);
        }

        public static void staticPrintInnerClass() {
            System.out.println(staticInnerClassField);
            System.out.println(staticOuterClassField);
        }
    }

    public void printOuterClass() {
        System.out.println(staticOuterClassField + " " + outerClassField);
        staticPrintOuterClass();
        InnerStaticClass.staticPrintInnerClass();
    }

    public static void staticPrintOuterClass() {
        System.out.println(staticOuterClassField);
    }
}
