package org.pklearning.jdbc.modifyData;

import org.pklearning.jdbc.Constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDetails {
    public void updateOrderDetails(int orderNumber, String productCode,int new_quantity) throws Exception {
        String updateOrderQuery="update "+ Constants.orderdetails+" set "
                +Constants.orderdetails_quantityOrdered+" = ?"
                +" where "+Constants.orderdetails_orderNumber+" = ?"
                +" and "+Constants.orderdetails_productCode+"=?";
        try(
                Connection conn= DriverManager.getConnection(Constants.uri,Constants.user_name,Constants.password);
                PreparedStatement ps=conn.prepareStatement(updateOrderQuery);
                ){
            ps.setInt(1,new_quantity);
            ps.setInt(2,orderNumber);
            ps.setString(3,productCode);
            int rowCount=ps.executeUpdate();
            System.out.println("Successfully updated "+rowCount+(rowCount==1?" row":" rows"));
        }
    }
}
