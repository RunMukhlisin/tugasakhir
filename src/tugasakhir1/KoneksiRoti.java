/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasakhir1;

/**
 *
 * @author user
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiRoti {
    private static Connection mysqlconfig;
    public static Connection ConfigDB() throws SQLException{
        try {
           String URL = "jdbc:mysql://localhost:3306/bakery";
           String User = "root";
           String Password = "";
           mysqlconfig = DriverManager.getConnection(URL,User,Password);
           
        } catch (Exception e) {
            System.err.println("KONEKSI GAGAL"+e.getMessage());
        }
        return mysqlconfig;
        
        
    }
    
}

