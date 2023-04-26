package pl.codecool.lambda_stream.stream.exercises.zad7;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Janusz", "Kowalski", 20000);
        Employee employee2 = new Employee(2, "Wiesław", "Zubrzycki", 30000);
        Employee employee3 = new Employee(3, "Kazimierz", "Adamski", 40000);

        EmployeeService employeeService = new EmployeeService();

        employeeService.addEmployeeToList(employee1);
        employeeService.addEmployeeToList(employee2);
        employeeService.addEmployeeToList(employee3);

        try {
            System.out.println("Pracownik z pensją co najmniej 30 000: " + employeeService.findEmployeeWithSalary());
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Sortuj wg nazwiska: " + employeeService.sortEmployeesByLastName());
        System.out.println("Najwyższa pensja: " + employeeService.getMaxSalary() + " zł");
    }
}
