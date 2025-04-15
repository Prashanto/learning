package org.pklearning.jdbc.preparedStmt_withNavigation;

import org.pklearning.jdbc.Constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductComponent {
    public void printProductList(double lowprice, double highPrice) throws Exception{
        try(
                Connection conn= DriverManager.getConnection(Constants.uri,Constants.user_name,Constants.password);
                PreparedStatement ps=conn.prepareStatement("select * from "+Constants.PRODUCTS +" where "+Constants.products_buyPrice +" between ? and ?");
                ){
            ps.setDouble(1,lowprice);
            ps.setDouble(2,highPrice);
            try(ResultSet rs=ps.executeQuery();
                ProductNavUtility pnv=new ProductNavUtility(rs);
            ){
                pnv.printForward();
                pnv.printFirst();
                pnv.printLast();
                pnv.printAbsolute(2);
                pnv.printRelative(3);
                pnv.printRev();
            }
        }
    }
}
