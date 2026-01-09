package org.example.head05.example5;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String dept;
    private int salary;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    public String getDept() {return dept;}
    public int getSalary() {return salary;}
    public String toString() {
        return name + "(" + dept + ", " + salary + ")";
    }
}

public class DepartmentReportExample {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
                new Employee("Alice", "HR", 3000),
                new Employee("Bob", "IT", 4000),
                new Employee("Charlie", "IT", 4500),
                new Employee("David", "HR", 3200),
                new Employee("Eve", "Sales", 3500)
        );
        Map<String, IntSummaryStatistics> deptStats = emps.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.summarizingInt(Employee::getSalary)));
                        deptStats.forEach((dept, stats) -> {
                            System.out.println("사원 수: " + stats.getCount());
                        });

    }
}
