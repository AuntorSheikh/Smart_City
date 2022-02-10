
package admin;

public class local_student extends Student{
    
    local_student(String name,String phoneNo,String institute,String gender,String id)
    {
        super(name,phoneNo,institute,gender,id);
    }
    
    @Override
    String busineaamaninfo(foreign_businessman ob)
    {
        if(ob.getcompanyName().equals("dcl"))
        {
             return "ID: "+ob.getid()+" "+"Name: "+ob.getname();
        }
        return null;
    }
}
