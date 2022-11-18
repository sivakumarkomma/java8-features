package com.stream.terminal;

import com.stream.Employee;
import com.stream.EmployeeUtil;

import java.util.Comparator;
import java.util.List;

public class MinExample {

    public static void main(String[] args) {
        streamMin(EmployeeUtil.getEmpList());
    }

    private static void streamMin(List<Employee> employeeList) {
     employeeList.forEach(System.out::println);
     employeeList.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
    }
}
