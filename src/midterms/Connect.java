/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterms;
import java.sql.*; 

/**
 *
 * @author samba
 */
public class Connect 
{

    static com.sun.jdi.connect.spi.Connection connectDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    Connection conn=null;
    public static Connection Connect()
    { 
        try{
            Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/afterburner","root","");
           return conn;
        
    }catch(Exception ex){
        System.out.println("Error In Connection.");
        return null;
    }
        
    }
    
        
    
    
}
