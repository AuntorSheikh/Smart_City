
package admin;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class sqlconnection {
    
     void connection() throws SQLException
     {
        Connection conn = null;
        Statement stmt = null;
       
        conn = DriverManager.getConnection("jdbc:mysql://localhost/smartcity","root","");
        conn.setAutoCommit(false); 
        System.out.println("Connection to SQLite has been established.");
        stmt = conn.createStatement();
     }
}
