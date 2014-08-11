package Koneksi;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {

    public Connection conn;
    public String URL = "jdbc:mysql://localhost:3306/db_zk?user=root&password=";
    
    public Koneksi()throws Exception{
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(URL);
        } catch (SQLException e) {
            throw new Exception("Error Driver"+e.getMessage());
        }
    }
    public Connection getConnection(){
        return conn;
    }

}
