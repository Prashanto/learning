package org.pklearning.jdbc.lob;

import org.pklearning.jdbc.Constants;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductLine {

    public boolean storeClob(String productLine, InputStreamReader isr) throws Exception{
        String sqlString= "update productlines set htmlDescription = ? where productLine = ?";
        try(Connection con=DriverManager.getConnection(Constants.uri,Constants.user_name,Constants.password);
            PreparedStatement pstmt=con.prepareStatement(sqlString);
                )
        {
            pstmt.setString(2,productLine);
            pstmt.setCharacterStream(1,isr);
            pstmt.executeUpdate();
            return true;
        }
    }

    public boolean storeBlob(String productLine, FileInputStream fis) throws Exception{
        String sqlString="update productlines set image = ? where productline = ?";
        try(
                Connection conn=DriverManager.getConnection(Constants.uri,Constants.user_name,Constants.password);
                PreparedStatement pstmt = conn.prepareStatement(sqlString);
                ){
            pstmt.setString(2,productLine);
            pstmt.setBinaryStream(1,fis);
            pstmt.executeUpdate();
            return true;
        }
    }

    public Reader readClob(String productLine) throws Exception{
        String sqlQuery = "select htmlDescription from productlines where productline = ?";
        try(
                Connection conn = DriverManager.getConnection(Constants.uri,Constants.user_name,Constants.password);
                PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
                ){
            pstmt.setString(1,productLine);
            try(
                    ResultSet rs=pstmt.executeQuery();
                    ){
                if(rs.next()){
                    return  rs.getCharacterStream(1);
                }else
                    return null;
            }
        }
    }

    public InputStream readBlob(String productLine) throws Exception{
        String sqlQuery="select image from productlines where productline = ?";
        try(
                Connection conn = DriverManager.getConnection(Constants.uri,Constants.user_name,Constants.password);
                PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
                ){
            pstmt.setString(1,productLine);
            try(
                    ResultSet rs=pstmt.executeQuery();
                    ){
                if(rs.next()){
                    return rs.getBinaryStream(1);
                }else
                    return null;
            }
        }
    }

    public void printClobColumn(Reader sr) throws IOException {
        try(
                BufferedReader br=new BufferedReader(sr);
        ){
            br.lines().forEach(System.out::println);
        }
    }

    public void blobToFile(InputStream is,String fileName) throws Exception {
        try(
                FileOutputStream fos=new FileOutputStream(fileName);
                ){
            fos.write(is.readAllBytes());
        }
    }
}
