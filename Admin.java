package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


abstract public class Admin {
    private String name;
    private String phoneNo;
    private String gender;
    private String id;
    
    String getname()
    {
        return name;
    }
    String getphoneNo()
    {
        return phoneNo;
    }
    String getgender()
    {
        return gender;
    }
    String getid()
    {
        return id;
    }

    Admin(String name,String phoneNo,String gender,String id)
    {
        this.name=name;
        this.phoneNo=phoneNo;
        this.gender=gender;
        this.id=id;
       
    }
    
    Connection dataentry(info_type ob)
    {
        Connection conn = null;
        Statement stmt = null; 
        try {
             
             conn = DriverManager.getConnection("jdbc:mysql://localhost/smartcity","root","");
             conn.setAutoCommit(false); 
             System.out.println("Connection to SQLite has been established.");
             stmt = conn.createStatement();
             String sql = "INSERT INTO allinfo values('"+ob.getinfoType()+"','"+ob.getid()+"','"+ob.getname()+"','"+ob.getphoneNo()+"','"+ob.getlocation()+"')";         
               stmt.executeUpdate(sql); 
             
               stmt.close();          
               conn.commit();          
               conn.close(); 
               return conn;
        } catch (SQLException ex) {
            //Logger.getLogger(super_admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Fillup The Form");
        }
        return null;
 
    }
    void deletedata(info_type ob)
    {
        Connection conn = null;
        
        Statement stmt = null;
        PreparedStatement stm = null;
        String sql="Delete from allinfo WHERE id='" +ob.getid()+"';";
        try
        {
           
            conn = DriverManager.getConnection("jdbc:mysql://localhost/smartcity","root","");
            System.out.println("Connection to SQLite has been established.");
            stmt = conn.createStatement();
            int rs=stmt.executeUpdate(sql);
            
            if(rs==1){
                     JOptionPane.showMessageDialog(null,"Successfully Deleted Profile");
                    
            }
            else{
               JOptionPane.showMessageDialog(null,"Could not deleted profile");
            }

        }
        catch(Exception e)
        {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Fillup The Form");
        }
    }
    
    abstract String studentinfo(local_student ob);
    abstract String touristinfo(foreign_tourist ob);
    
   
}
