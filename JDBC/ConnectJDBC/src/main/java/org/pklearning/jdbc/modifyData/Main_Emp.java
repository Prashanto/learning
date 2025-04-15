package org.pklearning.jdbc.modifyData;

import org.pklearning.jdbc.util.ExceptionHandling;

public class Main_Emp {
    public static void main(String[] args) {
        EmployeeManager em=new EmployeeManager();
        try {
            int rowCount=em.changeManager(1056,1002);
            System.out.println(rowCount + (rowCount == 1 ? " Employee" : " Employees") + " reassigned");
        } catch (Exception e) {
            ExceptionHandling.ExceptionHandler(e);
        }
    }
}
