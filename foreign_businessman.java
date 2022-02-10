
package admin;

public class foreign_businessman extends businessman{
    private final String country;
    
    String getcountry()
    {
        return country;
    }
    foreign_businessman(String name,String phoneNo,String companyName,String address,String country,String gender,String id)
    {
        super(name,phoneNo,companyName,address,gender,id);
        this.country=country;
    }
    
}
