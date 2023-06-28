package com.game.designpatterns.creational.prototype;

import java.util.List;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();
        Employees newEmployees = (Employees) employees.clone();
        List<String> empList = newEmployees.getEmployees();
        // Only female employees
        empList.remove("Akshay");
        empList.remove("Subhash");
        empList.remove("Boy");

        // output after processing
        System.out.println(employees.getEmployees());
        System.out.println(empList);
    }
}
