package programs.inheritanceDemo;
import java.util.Scanner;

public class Book_Inheritance_Demo_NIIT 
{
    public static void main(String[] args) 
    {
      int flag;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to Store Sofware Books");
        System.out.println("Enter 2 to Store Hardware Books");
    
        flag = sc.nextInt();
    if(flag == 1){
       Software_Book_NIIT sbook = new Software_Book_NIIT();
       sbook.take_Input();
       sbook.display_Book_Info();
    }
    else if (flag == 2){
        Hardware_Book_NIIT hbook = new Hardware_Book_NIIT();
        hbook.take_Input();
        hbook.display_Book_Info();
    }
    else{
        System.out.println("Please Enter Valid Input");
        System.out.println("Try Again Next Time");
    }
    }

}
