package org.codingdojo.kata;

import java.util.List;

public class EmployeeReport {

    public List<Employee> getAdult() {
        return List.of(new Employee("Sepp", 18),
                new Employee("Max", 51));
    }
}
