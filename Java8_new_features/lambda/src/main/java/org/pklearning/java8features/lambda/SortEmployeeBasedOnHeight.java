package org.pklearning.java8features.lambda;

import org.pklearning.java8features.lambda.data.LoadEmployeeData;
import org.pklearning.java8features.lambda.defn.Employee;

import java.io.FileNotFoundException;
import java.util.Comparator;

public class SortEmployeeBasedOnHeight {
    public static void main(String[] args) throws FileNotFoundException {
        LoadEmployeeData led=new LoadEmployeeData();
        Comparator<Employee> sortHeight=(e1,e2)->{
            return e1.getHeight_in_cm()-e2.getHeight_in_cm();
        };
        Comparator<Employee> sortSalary=(e1,e2)->{
            return (int) (e1.getSalary()-e2.getSalary());
        };
        led.getEmployees().stream().sorted(sortHeight.thenComparing(sortSalary)).forEach(System.out::println);
    }
}
