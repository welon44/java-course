package pl.obiektowosc.przyklad;

public class Main {
    public static void main(String[] args) {

        Address address = new Address("Targowa", 1);
        Address address2 = new Address("Polna", 12, 51, "Warszawa");
//        System.out.println(address.getStreetName());

        address.setStreetName("Targowa");
        System.out.println(address.getStreetName());

        Person person = new Person("Marcin", "Welenc", 34, address);
        System.out.println(person.getAddress());

        System.out.println("Hash code address: " + address.hashCode());
        System.out.println("Hash code address2: " + address2.hashCode());

        System.out.println("Equals: " + address.equals(address2));

        Person person1 = new Person("Marcin", "Welenc", 34, address);
        Person person2 = new Person("Marciniszyn", "Welencinio", 34, address);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        System.out.println(person1.equals(person2));
        System.out.println(person1);
    }
}
