
package Inheritance;

import java.util.Scanner;

public class Hardware_Book_NIIT extends Book_NIIT
{
    String hardware_category;
    String publisher;
    Scanner sc = new Scanner(System.in);
    public Hardware_Book_NIIT(){
    System.out.println("So You Want To Store Hardware Book");
    System.out.println("Please Enter Your Details");
    System.out.println("");
    }
    
    @Override
    public void take_Input(){
        super.take_Input();
        System.out.print("Hardware Category: ");
        hardware_category = sc.nextLine();
        System.out.print("Publisher: ");
        publisher = sc.nextLine();
    }
    
    @Override
    public void display_Book_Info(){
        System.out.println("");
        super.display_Book_Info();
        System.out.println("Hardware Category: " + hardware_category);
        System.out.println("Publisher: " + publisher);
    }
    
}
