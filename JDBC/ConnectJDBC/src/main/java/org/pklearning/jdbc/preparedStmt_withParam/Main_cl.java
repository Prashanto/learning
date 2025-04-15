package org.pklearning.jdbc.preparedStmt_withParam;

import org.pklearning.jdbc.util.ExceptionHandling;

public class Main_cl {
    public static void main(String[] args) {
        ProductComponent obj=new ProductComponent();
        try {
            obj.printProductList(60.0,95.0);
        } catch (Exception e) {
            ExceptionHandling.ExceptionHandler(e);
        }
    }
}
