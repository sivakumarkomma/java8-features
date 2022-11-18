package com.collectors;

import com.stream.Employee;
import com.stream.EmployeeUtil;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SummarizeStatisticsExample {

    public static void main(String[] args) {
        collectorsToSummaryStatistics(EmployeeUtil.getEmpList());
    }

    private static void collectorsToSummaryStatistics(List<Employee> employeeList) {
        employeeList.forEach(System.out::println);
        System.out.println(" ");
        IntSummaryStatistics summaryStatistics = employeeList.stream()
                .collect(Collectors.summarizingInt(Employee::getSalary));
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getAverage());
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getSum());
        System.out.println(summaryStatistics.getCount());
    }
}
