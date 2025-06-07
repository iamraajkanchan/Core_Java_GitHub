package programs.patternMatcherDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo3_NIIT 
{
    public static void main(String[] args) 
    {
        String t="Jo told me 2 ways to San Jose in 15 Minutes";
        
        Pattern p1=Pattern.compile("\\d\\d");
        Matcher m1=p1.matcher(t);
        
        while(m1.find())
        {
            System.out.println("Found: "+m1.group());
        }
        
        Pattern p2=Pattern.compile("\\sin\\s");
        Matcher m2=p2.matcher(t);
        
        while(m2.find())
        {
            System.out.println("Found: "+m2.group());
        }
        
        Pattern p3=Pattern.compile("\\Sin\\S");
        Matcher m3=p3.matcher(t);
        
        while(m3.find())
        {
            System.out.println("Found: "+m3.group());
        }
    }
    
}
