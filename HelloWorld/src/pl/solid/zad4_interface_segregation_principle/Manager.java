package pl.solid.zad4_interface_segregation_principle;

public class Manager {

    private IWorkable worker;

    public void setWorker(IWorkable worker) {
        this.worker = worker;
    }

    public void manage() {
        worker.work();
    }
}
