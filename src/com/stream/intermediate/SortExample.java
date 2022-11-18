package com.stream.intermediate;

import com.stream.Employee;
import com.stream.EmployeeUtil;

import java.util.Comparator;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {
        streamSortWithRating(EmployeeUtil.getEmpList());
        streamSortWithSalaryAsc(EmployeeUtil.getEmpList());
        streamSortWithSalaryDesc(EmployeeUtil.getEmpList());
    }

    private static void streamSortWithRating(List<Employee> employeeList) {
     employeeList.forEach(System.out::println);
     System.out.println("");
     employeeList.stream().sorted(Comparator.comparing(Employee::getRating)).forEach(System.out::println);
    }

    private static void streamSortWithSalaryAsc(List<Employee> employeeList) {
        employeeList.forEach(System.out::println);
        System.out.println("");
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
    }

    private static void streamSortWithSalaryDesc(List<Employee> employeeList) {
        employeeList.forEach(System.out::println);
        System.out.println("");
        employeeList.stream().
                sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(System.out::println);
    }
}
