
package programs.inheritanceDemo;

import java.util.Scanner;

public class Book_NIIT 
{
    String author_name;
    String title;
    float price;
    int number_of_pages;
    Scanner sc = new Scanner(System.in);    
    
    public void take_Input(){
        System.out.print("Enter Author Name: " );
        author_name = sc.nextLine();
        System.out.print("Enter Title Name:" );
        title = sc.nextLine();
        System.out.print("Enter Price:" );
        price = sc.nextFloat();
        System.out.print("Enter Pages: " );
        number_of_pages = sc.nextInt();
    }
     
    public void display_Book_Info(){
        System.out.println("Author Name: " + author_name );
        System.out.println("Title: " + title );
        System.out.println("Price: " + price );
        System.out.println("Number Of Pages: " + number_of_pages );
        
    }
}  
 