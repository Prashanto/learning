package org.pklearning.jdbc.lob;

import org.pklearning.jdbc.Constants;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductLine {

    public boolean storeClob(String productList, InputStreamReader file_str) throws Exception{
        try(
                Connection conn = DriverManager.getConnection(Constants.uri,Constants.user_name,Constants.password);
                PreparedStatement ps=conn.prepareStatement
                        ("update productlines set htmlDescription=? where productLine=?");
                ){
            ps.setCharacterStream(1,file_str);
            ps.setString(2,productList);

            ps.executeUpdate();

            return true;
        }
    }

    public boolean storeBlob(String productList, InputStream file_str) throws Exception{
        try(
                Connection conn = DriverManager.getConnection(Constants.uri,Constants.user_name,Constants.password);
                PreparedStatement ps=conn.prepareStatement
                        ("update productlines set image=? where productLine=?");
        ){
            ps.setBinaryStream(1,file_str);
            ps.setString(2,productList);

            ps.executeUpdate();

            return true;
        }
    }

    public Reader readClob(String productList) throws Exception{
        try(
                Connection conn=DriverManager.getConnection(Constants.uri,Constants.user_name,Constants.password);
                PreparedStatement ps=conn.prepareStatement("select htmlDescription from productlines  where productLine=?");
                ){

            ps.setString(1,productList);
            try(
                    ResultSet rs=ps.executeQuery();)

            {
                return  rs.getCharacterStream(1);
            }
        }
    }

    public InputStream readBlob(String productList) throws Exception{
        try(
                Connection conn=DriverManager.getConnection(Constants.uri,Constants.user_name,Constants.password);
                PreparedStatement ps=conn.prepareStatement("select image from productlines  where productLine=?");
        ){

            ps.setString(1,productList);
            try(
                    ResultSet rs=ps.executeQuery();)

            {
                return  rs.getBinaryStream(1);
            }
        }
    }
}
