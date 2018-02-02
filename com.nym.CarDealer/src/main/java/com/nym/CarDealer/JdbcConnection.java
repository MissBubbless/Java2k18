package com.nym.CarDealer;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcConnection {
public java.sql.Connection conn = null;
    public String url = "jdbc:mysql://localhost:3306/";
    public String dbName = "CARDEALER";
    public String driver = "com.mysql.jdbc.Driver";
    public String userName = ""; 
    public String password = "";
    public PreparedStatement stmt;
    public ResultSet rs;

    public void createdatabase(){

        try {

        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url+dbName,userName,password);
        System.out.println("Connected to the database");
        java.sql.Statement stmt = conn.createStatement();

    } catch (Exception e) {
        System.out.println("Error!!!");
    }


    }
    
    
  
}
