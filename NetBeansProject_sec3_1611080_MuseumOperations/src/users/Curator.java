
package users;

/**
 *
 * @author fuadj
 */
public class Curator extends Employee{

    public Curator(String name, String userId, String password) {
        super(name, userId, password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public void complain() {
        
    }

    @Override
    public void viewMeeting() {
        
    }
  
    
    
}
