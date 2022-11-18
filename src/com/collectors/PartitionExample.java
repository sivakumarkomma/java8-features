package com.collectors;

import com.stream.Employee;
import com.stream.EmployeeUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionExample {

    public static void main(String[] args) {
        collectorsJoining(EmployeeUtil.getEmpList());
    }

    private static void collectorsJoining(List<Employee> employeeList) {
        employeeList.forEach(System.out::println);
        System.out.println(" ");
        Map<Boolean, List<Employee>> partitions = employeeList.stream()
                .collect(Collectors.partitioningBy(o -> o.getRating() > 3));
        partitions.forEach((k,v)->{
            System.out.println(k);
            System.out.println("");
            v.forEach(employee -> System.out.println(employee.getFirstName()));
        });
    }
}
