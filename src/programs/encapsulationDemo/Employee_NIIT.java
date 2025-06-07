
package programs.encapsulationDemo;
public class Employee_NIIT 
{
    private String fname;
    private String lname;
    private String email;
    private long contact;
    private int Emp_Id;

    public Employee_NIIT() {
    }

    public Employee_NIIT(String fname, String lname, String email, long contact, int Emp_Id) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.contact = contact;
        this.Emp_Id = Emp_Id;
    }

    public int getEmp_Id() {
        return Emp_Id;
    }

    public void setEmp_Id(int Emp_Id) {
        this.Emp_Id = Emp_Id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }
    
    
            
}
