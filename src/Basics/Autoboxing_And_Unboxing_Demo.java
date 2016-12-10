package Basics;

public class Autoboxing_And_Unboxing_Demo 
{
    public static void main(String[] args) 
    {
        //Autoboxing and Unboxing
        
        Integer intObject=new Integer(1);
        int intPrimitive=2;
        
        Integer tempInteger;
        int tempPrimitive;
        
        tempInteger =new Integer(intPrimitive);
        tempPrimitive=intObject.intValue();
        
        tempInteger=intPrimitive;  //Auto Box
        tempPrimitive=intObject;   //Auto Unbox
    }
    
}
