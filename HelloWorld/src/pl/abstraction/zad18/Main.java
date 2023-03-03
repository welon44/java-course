package pl.abstraction.zad18;

import pl.abstraction.zad19.Laptop;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Intel", 256, "NVIDIA", "FIRMA KRZAK", "GeForce");
        Computer computer2 = new Computer("AMD", 1024, "ATI", "POPUŚ CZY TO TY", "Radeon");
        Laptop laptop1 = new Laptop("Intel core i21", 2048, "wbudowana", "G", "ThinkPad", "Low");

        System.out.println(computer1);
        System.out.println("Computer 1 hashcode: " + computer1.hashCode());
        System.out.println("==========================================================");
        System.out.println(computer2);
        System.out.println("Computer 2 hashcode: " + computer1.hashCode());
        System.out.println("==========================================================");
        System.out.println("Computer 1 equals computer 2: " + computer1.equals(computer2));
        System.out.println("==========================================================");
        computer1 = laptop1;
        System.out.println(computer1.getCompany());
        System.out.println(laptop1);
    }
}
