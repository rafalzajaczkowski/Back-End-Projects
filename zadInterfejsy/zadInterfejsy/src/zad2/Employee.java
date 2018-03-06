package zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Valuable, CrudRepository<Employee>, Comparable<Employee> {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public Employee findFirst() {
        return null;
    }
    // quicksort

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Adam",2000));
        employeeList.add(new Employee("Piotr",1221));
        employeeList.add(new Employee("Wojciech",100000));
        Collections.sort(employeeList);
        System.out.println(employeeList);
    }
    @Override
    public int compareTo(Employee secondEmployee) {
        return this.getSalary()-secondEmployee.getSalary();
    }
}
