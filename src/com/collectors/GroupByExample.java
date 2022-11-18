package com.collectors;

import com.stream.Employee;
import com.stream.EmployeeUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {

    public static void main(String[] args) {
        streamGroupBy(EmployeeUtil.getEmpList());
    }

    private static void streamGroupBy(List<Employee> employeeList) {
        Map<String, List<Employee>> groupByMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender));
        groupByMap.forEach((k,v) -> {
            System.out.println(k);
            v.forEach(System.out::println);
        });
    }
}
