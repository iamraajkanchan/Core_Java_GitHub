package programs.constructorDemo;
public class Constructor_Demo_NIIT 
{
    /*
    Constructor name and class name should be same.
    Constructor are called when an object of class is created.
    Constructor dont have any return type.
    Constructor are used to initialize member variable.
    */
    
    public static void main(String[] args) 
    {
        Employee_NIIT e=new Employee_NIIT("Govind", "Pandit", "scip2govind@gmail.com",4000000);
        System.out.println(e.email);
    }

}
