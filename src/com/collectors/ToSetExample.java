package com.collectors;

import com.stream.Employee;
import com.stream.EmployeeUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSetExample {

    public static void main(String[] args) {
        collectorsToSet(EmployeeUtil.getEmpList());
    }

    private static void collectorsToSet(List<Employee> employeeList) {
        employeeList.forEach(System.out::println);
        System.out.println(" ");
        Set<Employee> groupByMap = new HashSet<>(employeeList);
        groupByMap.forEach(employee -> System.out.println(employee.getFirstName()));
    }
}
