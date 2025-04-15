package org.pklearning.jdbc.modifyData;

import org.pklearning.jdbc.Constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeManager {
    public int changeManager(int oldManagerID,int newManagerID) throws Exception {
        String updateOrderQuery = "update " + Constants.employees + " set "
                + Constants.employees_reportsTo + " = ?"
                + " where " + Constants.employees_reportsTo + " = ?";
        try (
                Connection conn = DriverManager.getConnection(Constants.uri, Constants.user_name, Constants.password);
                PreparedStatement ps = conn.prepareStatement(updateOrderQuery);
        ) {
            ps.setInt(1, newManagerID);
            ps.setInt(2, oldManagerID);
            int rowCount = ps.executeUpdate();
            return rowCount;
        }
    }
}

