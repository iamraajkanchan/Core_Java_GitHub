package Collections;
import java.util.*;
public class CountStrings {
public static void main(String args[]){
    
    LinkedList <String> nameList = new LinkedList <>();
    int countInstance = 0;
    nameList.add("Tushar");
    nameList.add("Dipesh");
    nameList.add("Raaj");
    nameList.add("Prasad");
    
    LinkedList <String> nameCollection = new LinkedList<>();
    
    nameCollection.add("Tushar");
    nameCollection.add("Dipesh");
    nameCollection.add("Tushar");
    nameCollection.add("Raaj");
    nameCollection.add("Tushar");
    nameCollection.add("Prasad");
    nameCollection.add("Raaj");
    nameCollection.add("Tushar");
    nameCollection.add("Dipesh");
    nameCollection.add("Dipesh");
    nameCollection.add("Tushar");
    nameCollection.add("Prasad");
    nameCollection.add("Raaj");
    nameCollection.add("Raaj");
    nameCollection.add("Tushar");
    
   Iterator it_unique_name = nameList.iterator();
   Iterator it_collection_name = nameCollection.iterator();
   while(it_unique_name.hasNext()){
       while(it_collection_name.hasNext()){
           if(it_unique_name.next() == it_collection_name.next()){
               countInstance++;
           }
           System.out.println("No of " + it_unique_name.next() + " instance in Collection is : " + countInstance);
       }
   }

      
}
}
