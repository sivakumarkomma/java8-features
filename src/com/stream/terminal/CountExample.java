package com.stream.terminal;

import com.stream.Employee;
import com.stream.EmployeeUtil;

import java.util.Comparator;
import java.util.List;

public class CountExample {

    public static void main(String[] args) {
        streamCount(EmployeeUtil.getEmpList());
    }

    private static void streamCount(List<Employee> employeeList) {
     employeeList.forEach(System.out::println);
     System.out.println(employeeList.stream().filter(employee -> employee.getRating() > 3).count());
    }
}
