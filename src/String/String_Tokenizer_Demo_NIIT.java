package String;

import java.util.StringTokenizer;

public class String_Tokenizer_Demo_NIIT 
{
    public static void main(String[] args) 
    {
        String shirts="Blue shirt, Red shirt, Black shirt, Maroon shirt";
        
        StringTokenizer st=new StringTokenizer(shirts,", ");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
    
}
