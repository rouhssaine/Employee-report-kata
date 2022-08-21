package org.codingdojo.kata;

import java.util.List;

import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toList;

public class EmployeeReport {

    private List<Employee> employees;

    public EmployeeReport(Employee... employees) {
        this.employees = List.of(employees);
    }

    public List<String> getAdult() {
        return employees.stream()
                .filter(Employee::isAdult)
                .map(Employee::name)
                .map(String::toUpperCase)
                .sorted(reverseOrder())
                .collect(toList());
    }
}
