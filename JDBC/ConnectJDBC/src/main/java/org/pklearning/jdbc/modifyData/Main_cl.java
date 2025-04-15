package org.pklearning.jdbc.modifyData;

import org.pklearning.jdbc.util.ExceptionHandling;

public class Main_cl {
    public static void main(String[] args) {
        OrderDetails od=new OrderDetails();
        try {
            od.updateOrderDetails(10100,"S18_4409",50);
        } catch (Exception e) {
            ExceptionHandling.ExceptionHandler(e);
        }
    }
}
