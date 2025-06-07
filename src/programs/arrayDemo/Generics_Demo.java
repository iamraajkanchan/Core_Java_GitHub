package programs.arrayDemo;
public class Generics_Demo 
{
   public   static  <T>void  displayArray(T e[])
   {
       for(T i:e)
       {
           System.out.println(i);
       }
   }
    public static void main(String[] args) 
    {
        Integer a[]=new Integer[2];
        a[0]=23;
        a[1]=15;
        
        String s[]=new String[3];
        s[0]="Akshay";
        s[1]="Raaj";
        displayArray(a);
        displayArray(s);
        
    }

}
