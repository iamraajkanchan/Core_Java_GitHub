package programs.collectionsDemo;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Put_TreeMap_Demo_NIIT 
{
    public static void main(String[] args) 
    {
        Map<String,String> partList=new TreeMap<>();
        
        partList.put("s001","Blue Polo Shirt");
        partList.put("s002","Black Polo Shirt");
        partList.put("s003","Duke Hat");
        partList.put("s002","Black T-Shirt");//Overrite Value
        
        Set<String> keys=partList.keySet();
        
        System.out.println("---Part List----");
        for(String key:keys)
        {
            System.out.println("part#: "+key+" "+partList.get(key));
        }
        
        
        
    }
    
}
