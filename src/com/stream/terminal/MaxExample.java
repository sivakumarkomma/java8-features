package com.stream.terminal;

import com.stream.Employee;
import com.stream.EmployeeUtil;

import java.util.Comparator;
import java.util.List;

public class MaxExample {

    public static void main(String[] args) {
        streamMax(EmployeeUtil.getEmpList());
    }

    private static void streamMax(List<Employee> employeeList) {
     employeeList.forEach(System.out::println);
        System.out.println("");
     employeeList.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
    }
}
