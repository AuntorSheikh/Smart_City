
package admin;

public class local_tourist extends Tourist implements Iinfo{
    
    local_tourist(String name,String phoneNo,String address,String gender,String id)
    {
        super(name,phoneNo,address,gender,id);
    }
    
    /**
     *
     * @param ob
     * @return
     */
    @Override
    public String studentinfo(foreign_student ob)
    {
        return ob.getid()+ob.getinstitute()+ob.getcountry();
    }
}
