
package admin;


public class info_type {
    
    private final String infoType;
    private final String id;
    private final String name;
    private final String phoneNo;
    private final String location;
    
    String getinfoType()
    {
        return infoType;
    }
    String getid()
    {
        return id;
    }
    String getname()
    {
        return name;
    }
    String getphoneNo()
    {
        return phoneNo;
    }
    String getlocation()
    {
        return location;
    }
    
    info_type(String infoType,String id,String name,String phoneNo,String location)
    {
        this.infoType=infoType;
        this.id=id;
        this.name=name;
        this.phoneNo=phoneNo;
        this.location=location;
    }
    private String sql;
    
}
