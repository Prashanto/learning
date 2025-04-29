package org.pklearning.jdbc.connectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OrderDetails {
    public void getOrderDetails(int customerNumber) throws Exception
    {
        String sqlQuery ="select o.orderNumber,o.orderdate,c.customerName from orders o, customers c where c.customerNumber=o.customerNumber and c.customerNumber= ?";

        try (Connection conn=ConnectionPool.getConnection();
             PreparedStatement pstmt= conn.prepareStatement(sqlQuery);
        ){
            pstmt.setInt(1,customerNumber);
            try(
                    ResultSet rs=pstmt.executeQuery();
                    ){
                if(!rs.next()){
                    System.out.println("No rows returned");
                }
                do
                {

                    System.out.println(rs.getInt(1)+" : "+rs.getDate(2)+" : "+rs.getString(3));
                }
                while(rs.next());
            }
        }
    }

    public void tryConnection() throws Exception
    {
        String sqlQuery = "select orderNumber from orders";
        try(Connection conn = ConnectionPool.getConnection();
        PreparedStatement ptsmt =conn.prepareStatement(sqlQuery);){
            ptsmt.executeQuery();
            String msg=Thread.currentThread().getName() +" --> "+getConnectionID(conn);
            System.out.println(msg);
        }
    }
    private String getConnectionID(Connection conn){
        String conID = conn.toString();
        return conID.substring(conID.length() - 2);
    }
}
