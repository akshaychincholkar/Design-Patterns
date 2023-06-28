package com.game.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    List<String> employees;

    Employees(){
        employees = new ArrayList<>();
    }
    Employees(List<String> employees){
        this.employees = employees;
    }
    public void loadData(){
        // load the data from the database
        employees.add("Akshay");
        employees.add("Darshana");
        employees.add("Nita");
        employees.add("Subhash");
        employees.add("Boy");
        employees.add("Girl");
    }
    public List<String> getEmployees(){
        return employees;
    }

    // Notice that cloning is done as the deep copy of the employees created
    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>(employees);
        return new Employees(temp);
    }
}
