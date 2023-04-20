package pl.codecool.annotations.exercises.zad2;

@TargetAnnotationZad2(value = "person class")
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    @TargetAnnotationZad2(value = "constructor with 3 arguments")
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @TargetAnnotationZad2(value = "constructor with 2 arguments")
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @TargetAnnotationZad2(value = "constructor with 1 argument")
    public Person(String firstName) {
        this.firstName = firstName;
    }

    @TargetAnnotationZad2(value = "field first name")
    public String getFirstName() {
        return firstName;
    }

    @TargetAnnotationZad2(value = "field last name")
    public String getLastName() {
        return lastName;
    }

    @TargetAnnotationZad2(value = "field age")
    public int getAge() {
        return age;
    }

    @Override
    @TargetAnnotationZad2(value = "method")
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
