package pl.solid.zad4_interface_segregation_principle;

public class Worker implements IWorker {

    @Override
    public void work() {

        System.out.println("Working...");

    }

    @Override
    public void eat() {

    }
}
