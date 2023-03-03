package pl.abstraction.zad18;

import java.util.Objects;

public class Computer {

    private String processor;
    private int memory;
    private String graphics;
    private String company;
    private String model;

    public Computer(String processor, int memory, String graphics, String company, String model) {
        this.processor = processor;
        this.memory = memory;
        this.graphics = graphics;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Computer computer = (Computer) o;
        return memory == computer.memory && Objects.equals(processor, computer.processor) && Objects.equals(graphics, computer.graphics) && Objects.equals(company, computer.company)
                && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, memory, graphics, company, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", memory=" + memory +
                ", graphics='" + graphics + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
