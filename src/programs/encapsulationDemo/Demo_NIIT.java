package programs.encapsulationDemo;

import java.util.Scanner;

public class Demo_NIIT 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Employee_NIIT e=new Employee_NIIT();
        System.out.println("Enter Your first Name");
        e.setFname(sc.next());
        System.out.println("Your first Name is : "+e.getFname());
    }

}
