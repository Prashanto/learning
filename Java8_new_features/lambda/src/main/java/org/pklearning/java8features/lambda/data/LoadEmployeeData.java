package org.pklearning.java8features.lambda.data;

import org.pklearning.java8features.lambda.defn.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LoadEmployeeData {

    public LoadEmployeeData() throws FileNotFoundException {
        BufferedReader br=new BufferedReader(new FileReader("src/main/java/org/pklearning/java8features/lambda/data/Employees.txt"));
        List<Employee> elist=new ArrayList<Employee>();
        br.lines().skip(1).forEach((s1)->{elist.add(new Employee(s1));});
        this.employees=elist;

    }
    public LoadEmployeeData(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    List<Employee> employees;

    public static void main(String[] args) throws FileNotFoundException {
        LoadEmployeeData ed=new LoadEmployeeData();
        ed.getEmployees().forEach(System.out::println);
    }
}
