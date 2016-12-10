
package String;

public class StringBuilder_Employee_NIIT 
{
    private int Emp_Id;
    private String Fname;
    private String Lname;
    private String email;

    public StringBuilder_Employee_NIIT(int Emp_Id, String Fname, String Lname, String email) {
        this.Emp_Id = Emp_Id;
        this.Fname = Fname;
        this.Lname = Lname;
        this.email = email;
    }

    public int getEmp_Id() {
        return Emp_Id;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() 
    {
        StringBuilder sb=new StringBuilder(300);
        sb.append("Emp Id: "+Emp_Id+"\n");
        sb.append("First Name is: "+Fname+"\n");
        sb.append("Last Name: "+Lname+"\n");
        sb.append("Email id: "+email+"\n");
        
        return sb.toString();
    }
    
    
}
