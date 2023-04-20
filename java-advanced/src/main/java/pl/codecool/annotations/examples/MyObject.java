package pl.codecool.annotations.examples;

@TargetAnnotationExample("class")
public class MyObject {

    private String name;

    @TargetAnnotationExample("field: number")
    private int number;

    public int myPublicNumber;

    @TargetAnnotationExample("constructor - (String,int)")
    public MyObject(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public MyObject() {

    }

    @TargetAnnotationExample("method")
    @Override
    public String toString() {
        return "MyObject{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
