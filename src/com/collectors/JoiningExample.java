package com.collectors;

import com.stream.Employee;
import com.stream.EmployeeUtil;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {

    public static void main(String[] args) {
        collectorsJoining(EmployeeUtil.getEmpList());
    }

    private static void collectorsJoining(List<Employee> employeeList) {
        employeeList.forEach(System.out::println);
        System.out.println(" ");
        String csv = employeeList.stream()
                .map(Employee::getFirstName)
                .collect(Collectors.joining(","));
        System.out.println(csv);
    }
}
