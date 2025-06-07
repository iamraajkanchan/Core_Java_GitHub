
package programs.inheritanceDemo;

import java.util.Scanner;

public class Software_Book_NIIT extends Book_NIIT
{
    String software_version;
    String software_name;
    Scanner sc = new Scanner(System.in);
    public Software_Book_NIIT(){
    System.out.println("So You Want To Store Software Book");
    System.out.println("Please Enter Your Details");
    System.out.println("");
    }
    
    @Override
    public void take_Input(){
        super.take_Input();
        System.out.print("Software Version: " );
        software_version = sc.nextLine();
        System.out.print("Software Name: ");
        software_name = sc.nextLine();
    }
   
    @Override
    public void display_Book_Info(){
        System.out.println("");
        super.display_Book_Info();
        System.out.println("Software Version: " + software_version );
        System.out.println("Software Name: " + software_name);
    }
    
}
