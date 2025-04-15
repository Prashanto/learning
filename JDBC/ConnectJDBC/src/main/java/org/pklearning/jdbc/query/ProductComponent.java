package org.pklearning.jdbc.query;

import org.pklearning.jdbc.Constants;

import java.sql.*;

public class ProductComponent {
    public void printProductList() throws Exception {

        try (
                Connection conn = DriverManager.getConnection(Constants.uri, Constants.user_name, Constants.password);
                Statement stmt = conn.createStatement();
                ResultSet rslt = stmt.executeQuery("select * from " + Constants.PRODUCTS);
        ) {
            while (rslt.next()) {
                String productName = rslt.getString(Constants.products_productName);
                System.out.println("Product name= " + productName);

            }

        }


    }
}
