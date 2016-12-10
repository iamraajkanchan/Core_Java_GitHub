package Polymorphism;
public class Demo1 
{
    /*
    Polymorphism
    mean many forms.
    
    Method overloading
    same name but different paremeters
    
    Method overriding
    
    */
    public void add(float a ,float b)
    {
        System.out.println("Addition is: "+(a+b));
    }
    public void add(int a,int b)
    {
        System.out.println("Addition is: "+(a+b));
    }
    public static void main(String[] args) 
    {
        Demo1 d=new Demo1();
        d.add(1.2f,1.5f);
        d.add(2, 5);
    }

}
