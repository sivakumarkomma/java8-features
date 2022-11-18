package com.collectors;

import com.stream.Employee;
import com.stream.EmployeeUtil;

import java.util.List;
import java.util.stream.Collectors;

public class SumExample {

    public static void main(String[] args) {
        collectorsSummingDouble(EmployeeUtil.getEmpList());
    }

    private static void collectorsSummingDouble(List<Employee> employeeList) {
        employeeList.forEach(System.out::println);
        System.out.println(" ");
        Integer salarySum = employeeList.stream()
                .collect(Collectors.summingInt(value -> value.getSalary()));
        System.out.println(salarySum);
    }
}
