package org.codingdojo.kata;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class EmployeeReport {

    private List<Employee> employees;

    public EmployeeReport(Employee... employees) {
        this.employees = List.of(employees);
    }

    public List<Employee> getAdult() {
        return employees.stream()
                .filter(Employee::isAdult)
                .sorted(Comparator.comparing(Employee::name))
                .collect(toList());
    }
}
