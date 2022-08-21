package org.codingdojo.kata;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(ReplaceUnderscores.class)
public class EmployeeReportTest {

    EmployeeReport employeeReport;

    @Test
    void should_return_adult_employee_sorted_and_capitalized_names() {
        // GIVEN
        Employee max = new Employee("Max", 17);
        Employee sepp = new Employee("Sepp", 18);
        Employee nina = new Employee("Nina", 15);
        Employee mike = new Employee("Mike", 51);
        employeeReport = new EmployeeReport(max, sepp, nina, mike);

        // WHEN
        var result = employeeReport.getAdult();

        // THEN
        assertThat(result).containsExactly("MIKE", "SEPP");
    }

}
