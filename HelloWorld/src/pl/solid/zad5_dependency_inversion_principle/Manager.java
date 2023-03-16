package pl.solid.zad5_dependency_inversion_principle;

public class Manager {

    private IWorker worker;

    public void setWorker(IWorker worker) {
        this.worker = worker;
    }

    public void manager() {
        worker.work();
    }
}
