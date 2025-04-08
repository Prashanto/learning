package org.pklearning.java8features.lambda.defn;

import java.util.Arrays;
import java.util.StringJoiner;

public class Employee {

    int employee_id;
    double salary;
    int height_in_cm;
    String first_name,last_name;

    public Employee(int employee_id, double salary, int height_in_cm, String first_name, String last_name) {
        this.employee_id = employee_id;
        this.salary = salary;
        this.height_in_cm = height_in_cm;
        this.first_name = first_name;
        this.last_name = last_name;
    }
    public Employee(String line){
        String[] splitList=line.split(",");
//        System.out.println(splitList[0]);
        this.employee_id = Integer.parseInt(splitList[0].trim());
        this.salary = Double.parseDouble(splitList[1].trim());
        this.height_in_cm = Integer.parseInt(splitList[2].trim());
        this.first_name = splitList[3].trim();
        this.last_name = splitList[4].trim();
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHeight_in_cm() {
        return height_in_cm;
    }

    public void setHeight_in_cm(int height_in_cm) {
        this.height_in_cm = height_in_cm;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String toString(){
        StringJoiner sj=new StringJoiner(", ");
        sj.add("Employee ID = "+this.employee_id);
        sj.add("First Name = "+this.first_name);
        sj.add("Last Name = "+this.last_name);
        sj.add("Salary = "+this.salary);
        sj.add("Height = "+this.height_in_cm+"cm");
        return sj.toString();
    }
}
