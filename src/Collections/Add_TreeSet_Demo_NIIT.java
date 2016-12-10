package Collections;

import java.util.Set;
import java.util.TreeSet;

public class Add_TreeSet_Demo_NIIT 
{
    public static void main(String[] args) 
    {
        Set<String> set=new TreeSet<>();
        
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("three");//not added, only unique.
        
        for(String s:set)
        {
            System.out.println("item: "+s);
        }
        
        
    }
    
}
