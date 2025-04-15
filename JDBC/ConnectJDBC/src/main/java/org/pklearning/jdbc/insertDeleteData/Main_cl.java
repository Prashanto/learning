package org.pklearning.jdbc.insertDeleteData;

import org.pklearning.jdbc.util.ExceptionHandling;

public class Main_cl {
    public static void main1(String[] args) throws Exception {

        try {
            ProcessEmployee comp = new ProcessEmployee();

            int key = comp.createNewEmployee(
                    "Williams", "Roger", "x104",
                    "rwilliams@classicmodelcars.com", "3",
                    "Sales Manager (NA)");

            System.out.println("The auto-generated primary key = " + key);
        } catch (Exception exception) {
            ExceptionHandling.ExceptionHandler(exception);
        }

    }

    public static void main(String[] args) throws Exception {

        try {
            ProcessEmployee comp = new ProcessEmployee();

            boolean employee_status=comp.deleteEmployee(1704);

            System.out.println(employee_status?"Employee deleted successfully":"Employee deletion failed");
        } catch (Exception exception) {
            ExceptionHandling.ExceptionHandler(exception);
        }

    }
}
