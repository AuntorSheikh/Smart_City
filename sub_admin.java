package admin;

public class sub_admin  extends Admin{
    
    sub_admin(String name,String phoneNo,String gender,String id)
    {
        super(name,phoneNo,gender,id);
    }
    
    @Override
    String studentinfo(local_student ob)
    {
        if(ob.getgender().equals("female"))
        {
         return "ID: "+ob.getid()+" "+"Name: "+ob.getname()+" "+"Institute: "+ob.getinstitute();
        }
        return null;
    }
    @Override
    String touristinfo(foreign_tourist ob)
    {
        if(ob.getcountry().equals("usa"))
        {
            return "ID: "+ob.getid()+" "+"Name: "+ob.getname()+" "+"Institute: "+ob.getaddress();
        }
        return null;
    }
}
