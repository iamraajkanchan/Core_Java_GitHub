
package programs.StringDemo;

public class Simple_String_Method_NIIT 
{
    public static void main(String[] args) 
    {
        String tc01="It was the best of times";
        String tc02="It was the worst of times";
        
        if(tc01.equals(tc02))
        {
            System.out.println("String match\n");
        }
        if(tc01.equalsIgnoreCase(tc02))
        {
            System.out.println("String match but case is not checked!\n");
        }
        if(tc01.isEmpty())
        {
            System.out.println("String is empty\n");
        }
        if(tc01.contains("It was"))
        {
            System.out.println("It was found\n");
        }
        String temp=tc02.replace("w", "zw");
        System.out.println(temp+"\n");
        System.out.println(tc02.substring(5,12)+"\n");
    }
    
}
