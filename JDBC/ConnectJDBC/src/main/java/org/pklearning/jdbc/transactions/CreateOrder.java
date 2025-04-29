package org.pklearning.jdbc.transactions;

import org.pklearning.jdbc.util.ExceptionHandling;

public class CreateOrder {
    public static void main(String[] args) {
        new ConnectionPool();
        LineItem li=new LineItem("S18_1662",10,150.50);
        int customerNumber=103;
        OrderComponent ord=new OrderComponent();
        try {
           int orderNumber = ord.createOrder(customerNumber,li);
           if(orderNumber>0){
               System.out.println("Order created with order number "+orderNumber);
           }else{
               System.out.println("Order could not be created");
           }
        } catch (Exception e) {
            ExceptionHandling.ExceptionHandler(e);
        }
    }
}
