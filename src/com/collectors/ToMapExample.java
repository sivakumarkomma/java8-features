package com.collectors;

import com.stream.Employee;
import com.stream.EmployeeUtil;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapExample {

    public static void main(String[] args) {
        collectorsToMap(EmployeeUtil.getEmpList());
        collectorsToMapFunctionIdentity(EmployeeUtil.getEmpList());
    }

    private static void collectorsToMap(List<Employee> employeeList) {
        employeeList.forEach(System.out::println);
        System.out.println(" ");
        Map<String, Integer> groupByMap = employeeList.stream()
                .collect(Collectors.toMap(Employee::getFirstName, Employee::getSalary));
        groupByMap.forEach((k,v) -> {
            System.out.println(k + " " + v);
        });
    }

    private static void collectorsToMapFunctionIdentity(List<Employee> employeeList) {
        employeeList.forEach(System.out::println);
        System.out.println(" ");
        Map<Employee, Integer> groupByMap = employeeList.stream()
                .collect(Collectors.toMap(Function.identity(), Employee::getSalary));
        groupByMap.forEach((k,v) -> {
            System.out.println(k.getFirstName() + " " + v);
        });
    }
}
