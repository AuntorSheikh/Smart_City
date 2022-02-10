package admin;

public class foreign_student extends Student{
    
    private final String country;
    
    String getcountry()
    {
        return country;
    }
    foreign_student(String name,String phoneNo,String institute,String gender,String id,String country)
    {
        super(name,phoneNo,institute,gender,id);
        this.country=country;
    }
    @Override
    String busineaamaninfo(foreign_businessman ob)
    {
        if(ob.getcountry().equals("usa"))
        {
             return "ID: "+ob.getid()+" "+"Name: "+ob.getname()+" Company Name : "+ob.getcompanyName();
        }
        return null;
    }
}
