package org.codingdojo.kata;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(ReplaceUnderscores.class)
public class EmployeeReportTest {

    @Test
    void should_return_employee_more_18_years() {
        // GIVEN
        Employee max = new Employee("Max", 17);
        Employee sepp = new Employee("Sepp", 18);
        Employee nina = new Employee("Nina", 15);
        Employee mike = new Employee("Max", 51);
        EmployeeReport employeeReport = new EmployeeReport();

        // WHEN
        List<Employee> result = employeeReport.getAdult();

        // THEN
        assertThat(result).containsExactly(sepp, mike);
    }

}
