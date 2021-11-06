
package users;


public abstract class Employee extends User {
    
    protected String name;
    protected String salary;
    protected String phoneNo;

    public Employee() {
    }

    /*public Employee(String name, String salary, String phoneNo) {
        this.name = name;
        this.salary = salary;
        this.phoneNo = phoneNo;
    }*/

    public Employee(String name, String salary, String phoneNo, String userId, String password) {
        super(userId, password);
        this.name = name;
        this.salary = salary;
        this.phoneNo = phoneNo;
    }

    public Employee(String name, String userId, String password) {
        super(userId, password);
        this.name = name;
    }
    
    public abstract void complain();
    public abstract void viewMeeting();
    
    
}
