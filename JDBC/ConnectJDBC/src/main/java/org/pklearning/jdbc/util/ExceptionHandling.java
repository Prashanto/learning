package org.pklearning.jdbc.util;

import java.sql.SQLException;

public class ExceptionHandling {
    public static void ExceptionHandler(Exception e) {
        if (e instanceof SQLException){
            SQLException se=(SQLException)e;
            System.out.println("Error code: "+se.getErrorCode());
            System.out.println("Error state: "+se.getSQLState());
        }
        System.out.println("Exception message: "+e.getMessage());
        System.out.println("Stack Trace:");
        e.printStackTrace();
    }
}
