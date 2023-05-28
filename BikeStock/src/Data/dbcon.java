/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class dbcon {
    
    public static Connection con;
    public static Connection createDbConnection()
    {
        try
        {
        String dbpath="jdbc:mysql://localhost:3306/bikeshop";
        con=DriverManager.getConnection(dbpath,"root","");
        }
        catch(SQLException e)
        {
            
        }
        return con;
        
    }
    
}
