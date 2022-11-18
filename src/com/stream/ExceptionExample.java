package com.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExceptionExample {

    public static void main(String[] args) {
        streamException(EmployeeUtil.getEmpList());
    }

    private static void streamException(List<Employee> employeeList) {
        List<Integer> nameList = employeeList.stream()
                .map(employee -> Integer.parseInt(employee.getFirstName()))
                .collect(Collectors.toList());


    }
}
