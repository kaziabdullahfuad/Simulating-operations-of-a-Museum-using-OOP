
package users;


public class MuseumMember extends User {
   
    private String name;
    private String phoneNo;
   // private String email;

    public MuseumMember() {
    }

    public MuseumMember(String name, String userId, String password) {
        super(userId, password);
        this.name = name;
    }

    @Override
    public String toString() {
        return "MuseumMember{" + "name=" + name + ", phoneNo=" + phoneNo + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    public void payBill()
    {
        
    }
    
    
    
}
