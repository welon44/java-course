package pl.statics;

public class StaticsExample {

    // final mowi, ze wartosc pola nie moze sie zmienic
    public static final String MY_FINAL_STRING = "SOME_FINAL_STATIC_VALUE";
    public String myPublicField = "myPublicField";
    private String myPrivateField = "myPrivateField";

    public StaticsExample() {

    }

    public void setMyPrivateField(String myPrivateField) {
        this.myPrivateField = myPrivateField;
    }

    public void setMyPublicField(String myPublicField) {
        this.myPublicField = myPublicField;
    }

//    public void setMyFinalString(String myFinalString) {
//        this.MY_FINAL_STRING = myFinalString;
//    }

    // static sa tworzone w momencie tworzenia klasy
    public static void myStaticMethod() {
        System.out.println(MY_FINAL_STRING);
    }

}
