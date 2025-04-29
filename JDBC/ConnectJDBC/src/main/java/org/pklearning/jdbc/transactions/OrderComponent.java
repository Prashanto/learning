package org.pklearning.jdbc.transactions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderComponent {
    public int createOrder(int customerNumber, LineItem lineItem) throws Exception {
        String orderInsert="insert into orders (orderDate,requiredDate,status,customerNumber)"+
                "values (now(),now(),'In Progress',?)";
        String orderDetailsInsert="insert into orderdetails (orderNumber,productCode,quantityOrdered,priceEach,orderLineNumber)"+
                "values (?,?,?,?,?)";
        int orderNumber=-1;
        try(Connection conn=ConnectionPool.getConnection();
            PreparedStatement ptst=conn.prepareStatement(orderInsert, Statement.RETURN_GENERATED_KEYS)
        ){
            conn.setAutoCommit(false);
            ptst.setInt(1,customerNumber);
            ptst.executeUpdate();
            try(
                    ResultSet rs=ptst.getGeneratedKeys();
                    ){
                if(!rs.next()){
                    conn.rollback();
                    return 0;
                }
                orderNumber=rs.getInt(1);
                try(PreparedStatement ordDetailsPtst=conn.prepareStatement(orderDetailsInsert);){
                    ordDetailsPtst.setInt(1,orderNumber);
                    ordDetailsPtst.setString(2,lineItem.getProductCode());
                    ordDetailsPtst.setInt(3,lineItem.getQuantityOrdered());
                    ordDetailsPtst.setDouble(4,lineItem.getPriceEach());
                    ordDetailsPtst.setDouble(5,1);

                    int count=ordDetailsPtst.executeUpdate();
                    if(count==1){
                        conn.commit();
                        return orderNumber;
                    }
                    else {
                        conn.rollback();
                        return 0;
                    }
                }
            }

        }
    }
}
