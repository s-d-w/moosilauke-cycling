package com.moosilaukecycling.dao;

import org.sqlite.SQLiteConfig;
import org.sqlite.SQLiteOpenMode;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLiteConnection {

    private SQLiteConnection() { }

    private volatile static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            synchronized (SQLiteConnection.class) {
                if (connection == null) {
                    try {
                        Class.forName("org.sqlite.JDBC");
                        SQLiteConfig config = new SQLiteConfig();
                        config.setOpenMode(SQLiteOpenMode.FULLMUTEX);
                        connection = DriverManager.getConnection("jdbc:sqlite:src/main/resources/sqlite/test.db", config.toProperties());
                        // ensure schema exists
                    } catch (Exception e) {
                        System.err.println(e.getClass().getName() + ": " + e.getMessage());
                        System.exit(1);
                    }
                }
            }
        }
        return connection;
    }
}
