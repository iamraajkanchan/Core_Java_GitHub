
package programs.arrayDemo;

import java.util.Scanner;

public class Array_Demo_NIIT 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[2];
        System.out.println("Enter first Number");
        arr[0]=sc.nextInt();
        System.out.println("Enter Second Number");
        arr[1]=sc.nextInt();
        
        //Simple for loop'
        for(int i=0;i<2;i++)
        {
            System.out.println(arr[i]);
        }
        
        //foreach loop
        for(int a:arr)
        {
            System.out.println(a);
        }
    }

}
