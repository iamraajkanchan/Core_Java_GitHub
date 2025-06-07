package programs.collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Add_Demo_2_NIIT 
{
    public static void main(String[] args) 
    {
      List<Integer> partList=new ArrayList<>(3);
        partList.add(new Integer(1111));
        partList.add(new Integer(2222));
        partList.add(new Integer(3333));
      //partList.add("Oops a string! ");
      
      /*
      for(int a:partList)
      {
          System.out.println(a);
      }
      */
      
      Iterator elements=partList.iterator();
      
      while(elements.hasNext())
      {
          Integer partNumberObject=(Integer)(elements.next()); //error?
          int partNumber =partNumberObject.intValue();
          
          System.out.println("Part Number: "+partNumber);
      }
    }
    
}
