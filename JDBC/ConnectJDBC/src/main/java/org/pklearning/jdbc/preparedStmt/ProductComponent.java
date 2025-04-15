package org.pklearning.jdbc.preparedStmt;

import org.pklearning.jdbc.Constants;

import java.sql.*;

public class ProductComponent{

    public ProductComponent() throws Exception {
        try(
                Connection conn= DriverManager.getConnection(Constants.uri,Constants.user_name,Constants.password);
                PreparedStatement pstmt=conn.prepareStatement("select * from "+Constants.PRODUCTS);
                ResultSet rs=pstmt.executeQuery();
        ){
            while (rs.next()){
                System.out.println("Product name: "+rs.getString(Constants.products_productName));
            }
        }

    }

}
