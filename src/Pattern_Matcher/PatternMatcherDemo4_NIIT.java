package Pattern_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo4_NIIT 
{
    public static void main(String[] args) 
    {
        String t="Longlonglong ago , in a galaxy far far away";
        
        Pattern p1=Pattern.compile("ago.*");
        Matcher m1=p1.matcher(t);
        
        if(m1.find())
        {
            System.out.println("Found: "+m1.group());
        }
        
        
        Pattern p2=Pattern.compile("gal.{3}");
        Matcher m2=p2.matcher(t);
        
        if(m2.find())
        {
            System.out.println("Found: "+m2.group());
        }
        
        
        Pattern p3=Pattern.compile("(long){2}");
        Matcher m3=p3.matcher(t);
        
        if(m3.find())
        {
            System.out.println("Found: "+m3.group());
        }
        
        Pattern p4=Pattern.compile("ago.*far");
        Matcher m4=p4.matcher(t);
        
        if(m4.find())
        {
            System.out.println("Found: "+m4.group());
        }
        
        Pattern p5=Pattern.compile("ago.?far");
        Matcher m5=p5.matcher(t);
        
        if(m5.find())
        {
            System.out.println("Found: "+m5.group());
        }
    }
    
}
