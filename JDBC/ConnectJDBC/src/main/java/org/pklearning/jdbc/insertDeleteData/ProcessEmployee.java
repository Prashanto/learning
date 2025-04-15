package org.pklearning.jdbc.insertDeleteData;

import org.pklearning.jdbc.Constants;

import java.sql.*;

public class ProcessEmployee {
    public int createNewEmployee(String lastName, String firstName,
                                 String extension, String email,
                                 String officeCode,
                                 String jobTitle) throws Exception
    {
        try(
                Connection conn= DriverManager.getConnection(Constants.uri,Constants.user_name,Constants.password);
                PreparedStatement ps=conn.prepareStatement("insert into "+Constants.employees
                        + "(lastName, firstName, extension, email, officeCode, jobTitle) "
                        + "VALUES (?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

                ){
            ps.setString(1, lastName);
            ps.setString(2, firstName);
            ps.setString(3, extension);
            ps.setString(4, email);
            ps.setString(5, officeCode);
            ps.setString(6, jobTitle);

            ps.executeUpdate();
            try(ResultSet rs=ps.getGeneratedKeys()){
                int autoGenKey=0;

                if(rs.next()){
                    autoGenKey=rs.getInt(1);
                }
                return autoGenKey;
            }
        }
    }


    public boolean deleteEmployee(int employeeNumber) throws Exception {

        try(Connection connection = DriverManager.getConnection(Constants.uri,Constants.user_name,Constants.password);

            PreparedStatement preparedStatement = connection
                    .prepareStatement("DELETE FROM "+Constants.employees+" WHERE "+Constants.employees_employeeNumber+" = ?");){

            preparedStatement.setInt(1, employeeNumber);

            int count = preparedStatement.executeUpdate();

            return count > 0 ? true : false;

        }


    }
}
