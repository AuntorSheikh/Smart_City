
package admin;

public class foreign_tourist extends Tourist implements Iinfo{
    
     private final String country;
     String getcountry()
     {
         return country;
     }
    foreign_tourist(String name,String phoneNo,String address,String country,String gender,String id)
    {
        super(name,phoneNo,address,gender,id);
        this.country=country;
    }
    
    String touristinfo(String id)
    {
        if(id.equals("t001"))
        {
            return "Name: " + getname();
        }
        return null;
    }
    
    String touristinfo(String id ,String gender)
    {
        if(id.equals("t001") && gender.equals("male"))
        {
            return "Name: " + getname()+" Country name: "+ getcountry();
        }
        return null;
    }
    
     @Override
   public String studentinfo(foreign_student ob)
    {
        return ob.getid()+ob.getinstitute()+ob.getcountry();
    }
    
}
