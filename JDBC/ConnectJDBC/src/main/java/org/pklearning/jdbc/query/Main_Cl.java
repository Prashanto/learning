package org.pklearning.jdbc.query;

import org.pklearning.jdbc.util.ExceptionHandling;

public class Main_Cl {

    public static void main(String[] args) {
        ProductComponent obj=new ProductComponent();
        try {
            obj.printProductList();
        } catch (Exception e) {
            ExceptionHandling.ExceptionHandler(e);
        }
    }
}
