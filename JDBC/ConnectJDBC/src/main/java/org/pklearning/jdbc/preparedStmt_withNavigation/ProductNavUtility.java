package org.pklearning.jdbc.preparedStmt_withNavigation;

import org.pklearning.jdbc.Constants;

import java.sql.ResultSet;

public class ProductNavUtility implements AutoCloseable {

    ResultSet rs=null;

    public ProductNavUtility(ResultSet rs){ this.rs=rs;}

    public void printForward() throws Exception{
        rs.beforeFirst();
        System.out.println("Print Forward: ");
        while (rs.next()){
            System.out.println("Product name: "+rs.getString(Constants.products_productName));
        }
    }

    public void printFirst() throws Exception{
        System.out.println("Print First: ");
        if(rs.first())
            System.out.println("Product name: "+rs.getString(Constants.products_productName));
    }

    public void printLast() throws Exception{
        System.out.println("Print Last: ");
        if(rs.last())
            System.out.println("Product name: "+rs.getString(Constants.products_productName));
    }

    public void printAbsolute(int position) throws Exception{
        System.out.println("Print Absolute: ");
        if(rs.absolute(position))
            System.out.println("Product name: "+rs.getString(Constants.products_productName));
    }

    public void printRelative(int position) throws Exception{
        System.out.println("Print Relative: ");
        if(rs.relative(position))
            System.out.println("Product name: "+rs.getString(Constants.products_productName));
    }

    public void printRev() throws Exception{
        System.out.println("Print in reverse: ");
        rs.afterLast();
        while(rs.previous())
            System.out.println("Product name: "+rs.getString(Constants.products_productName));
    }

    @Override
    public void close() throws Exception {
        this.rs.close();
    }

}
