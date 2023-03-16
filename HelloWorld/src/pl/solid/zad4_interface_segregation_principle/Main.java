package pl.solid.zad4_interface_segregation_principle;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager();

        IWorker worker = new Worker();

        manager.setWorker(worker);

        manager.manage();
    }
}
