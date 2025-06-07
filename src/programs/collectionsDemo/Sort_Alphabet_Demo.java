package programs.collectionsDemo;
import java.util.*;
public class Sort_Alphabet_Demo {
 public static void main(String args[]){
     ArrayList nameList = new ArrayList <>();
     nameList.add("Hitesh");
     nameList.add("Tushar");
     nameList.add("Dipesh");
     nameList.add("Prasad");
     nameList.add("Jugal");
     nameList.add("Chintamani");
     nameList.add("Krish");
     nameList.add("Tapan");
     Collections.sort(nameList);
     
     Iterator it = nameList.iterator();
     while(it.hasNext()){
         System.out.println(it.next());
     }
 }
}
