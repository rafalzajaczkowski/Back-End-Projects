package com.company;

public class Employee implements Valuable{

    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
    @Override
    public int getValue() {
        return (int) this.salary;
    }
}
