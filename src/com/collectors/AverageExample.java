package com.collectors;

import com.stream.Employee;
import com.stream.EmployeeUtil;

import java.util.List;
import java.util.stream.Collectors;

public class AverageExample {

    public static void main(String[] args) {
        collectorsAverageDouble(EmployeeUtil.getEmpList());
    }

    private static void collectorsAverageDouble(List<Employee> employeeList) {
        employeeList.forEach(System.out::println);
        System.out.println(" ");
        Double salarySum = employeeList.stream()
                .collect(Collectors.averagingInt(Employee::getSalary));
        System.out.println(salarySum);
    }
}
