package admin;
public class super_admin extends Admin{
    private final int experience;
    int getexperience()
    {
        return experience;
    }
      
    super_admin(String name,String phoneNo,String gender,String id ,int experience)
    {
        super(name,phoneNo,gender,id);
        this.experience=experience;
    }
    
    
    
    
    @Override
    String studentinfo(local_student ob)
    {
        if(ob.getgender().equals("male"))
        {
            return "ID: "+ob.getid()+" "+"Name: "+ob.getname()+" "+"Institute: "+ob.getinstitute();
        }
        return null;
    }
    
    @Override
    String touristinfo(foreign_tourist ob)
    {
        if(ob.getcountry().equals("uk"))
        {
            return "ID: "+ob.getid()+" "+"Name: "+ob.getname()+" "+"Institute: "+ob.getaddress();
        }
        return null;
    }
}
