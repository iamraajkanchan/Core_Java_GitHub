package programs.collectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Add_Demo_1_NIIT 
{
    public static void main(String[] args) 
    {
        // to understand better use this link http://www.javatpoint.com/ArrayList-in-collection-framework
        
        List<Integer> partList=new ArrayList<>(3);
        partList.add(new Integer(1111));
        partList.add(new Integer(2222));
        partList.add(new Integer(3333));
        partList.add(new Integer(4444));// ArrayList Auto Grows
        System.out.println("First Part "+partList.get(0));  //First Item
        partList.add(0,new Integer(5555)); //Insert an item by index
        
        
        for(int i:partList)
        {
            System.out.println(i);
        }
        
    }
    
}
