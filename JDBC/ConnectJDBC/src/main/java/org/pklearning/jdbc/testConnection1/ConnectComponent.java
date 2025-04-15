package org.pklearning.jdbc.testConnection1;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectComponent {
    public boolean tryConnection() throws Exception{
        try (

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","oracle");
        ){

            return conn.isValid(2);

        }
    }
}
