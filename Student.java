
package admin;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

abstract public class Student {
    private String name;
    private String phoneNo;
    private String institute;
    private String gender;
    private String id;
    
    String getname()
    {
        return name;
    }
    String getphoneno()
    {
        return phoneNo;
    }
    String getinstitute()
    {
        return institute;
    }
    String getgender()
    {
        return gender;
    }
    String getid()
    {
        return id;
    }
    
    
    Student(String name,String phoneNo,String institute,String gender,String id)
    {
        this.name=name;
        this.phoneNo=phoneNo;
        this.institute=institute;
        this.gender=gender;
        this.id=id;
       
    }
    
    public ArrayList<info_type> userList(String sql)
    {
          ArrayList<info_type> usersList = new ArrayList<>();
          Connection conn = null;
          Statement stmt = null;
            try
            {
         
            conn = DriverManager.getConnection("jdbc:mysql://localhost/smartcity","root","");
            System.out.println("Connection to SQLite has been established.");
            stmt = conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            info_type info;
            while(rs.next())
            {
                info= new info_type(rs.getString("info_type"),rs.getString("id"),rs.getString("name"),rs.getString("phoneno"),rs.getString("location"));
                usersList.add(info);
              
            }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        return usersList;
    }
   
    abstract String busineaamaninfo(foreign_businessman ob);
}
