package programs.StringDemo;

public class Split_Demo_NIIT 
{
    public static void main(String[] args) 
    {
        String shirts="Blue shirt, Red shirt, Black shirt, Maroon shirt";
        
        String results[]=shirts.split(", ");
        for(String shirtstr:results)
        {
            System.out.println(shirtstr);
        }
    }
    
}
