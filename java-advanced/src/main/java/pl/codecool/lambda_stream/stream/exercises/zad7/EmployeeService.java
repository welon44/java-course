package pl.codecool.lambda_stream.stream.exercises.zad7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeService {

    private final List<Employee> employees = new ArrayList<>();

    public void addEmployeeToList(Employee employee) {
        employees.add(employee);
    }

    public Employee findEmployeeWithSalary() {
        return employees.stream()
                .filter(Objects::nonNull)
                .filter(e -> e.getSalary() >= 30000)
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("Nie znaleziono pracownika."));
    }

    public List<Employee> sortEmployeesByLastName() {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName))
                .collect(Collectors.toList());
    }

    public int getMaxSalary() {
        return employees.stream().filter(Objects::nonNull)
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow()
                .getSalary();
    }

}
