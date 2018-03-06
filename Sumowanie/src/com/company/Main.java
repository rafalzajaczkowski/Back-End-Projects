package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Valuable> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Adam.","Kowalski",1222.33));
        employeeList.add(new Employee("Piotr.","Nowak",12000.44));

        System.out.println(Sum.sum(employeeList));
    }
}
