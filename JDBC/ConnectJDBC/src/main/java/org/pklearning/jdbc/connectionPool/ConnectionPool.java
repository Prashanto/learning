package org.pklearning.jdbc.connectionPool;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.pklearning.jdbc.Constants;

import java.sql.Connection;

public class ConnectionPool {

    private static HikariDataSource dataSource;
    static {
        HikariConfig config=new HikariConfig();
        config.setJdbcUrl(Constants.uri);
        config.setUsername(Constants.user_name);
        config.setPassword(Constants.password);

        dataSource =new HikariDataSource(config);
        dataSource.setMaximumPoolSize(4);
    }

    public ConnectionPool() {}

    public static Connection getConnection() throws Exception{
        return dataSource.getConnection();
    }
}
