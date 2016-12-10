package Basics;
public class Static_Demo_NIIT 
{
    static int a=1;

    public Static_Demo_NIIT() 
    {
        a++;
        System.out.println(a);
    }
     public static  void show()
     {
         int a;//variable which we created in static method is bydefault static.
         System.out.println("this is show function");
     }
    public static void main(String[] args) 
    {
        show();
        Static_Demo_NIIT sd=new Static_Demo_NIIT();
        Static_Demo_NIIT sd1=new Static_Demo_NIIT();
    }

}
