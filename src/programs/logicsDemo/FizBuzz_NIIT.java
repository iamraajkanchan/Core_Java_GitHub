
package programs.logicsDemo;

import java.util.Scanner;

public class FizBuzz_NIIT 
{
    public static void main(String[] args) 
    {
    
        Scanner sc = new Scanner(System.in);
        int firstInput[] = new int[1];
        int iterrator1;
        
        System.out.println("Enter One Number");
                
        firstInput[0] = sc.nextInt();
        int secondInput[] = new int[firstInput[0]];
        
        System.out.println("Enter " + firstInput[0] + " Number");
        System.out.println();
        for(int i = 0; i <= firstInput[0] - 1 ; i ++)
        {
            secondInput[i] = sc.nextInt();
        }
        
        for(int j = 0; j < firstInput[0]; j++)
        {
            for(iterrator1 = 1; iterrator1 <= secondInput[j]; iterrator1++)
            {
                if(( iterrator1 % 3 == 0) && (iterrator1 % 5 == 0)){
                System.out.println("Fizz Buzz"); 
             }
                else if (iterrator1 % 3 == 0){
                    System.out.println("Fizz");
                } 
                else if ((iterrator1 % 5 == 0) ){
                    System.out.println("Buzz");
                }
                else{
                    System.out.println(iterrator1);
                }
            }
        }
    }

}
