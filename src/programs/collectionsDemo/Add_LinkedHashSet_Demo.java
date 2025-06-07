package programs.collectionsDemo;

import java.util.*;
public class Add_LinkedHashSet_Demo {

    public static void main(String args[]){
    // maintains insertion order and contains unique elements
    LinkedHashSet <String> nameList = new LinkedHashSet<String>();
        nameList.add("Tushar");
        nameList.add("Dipesh");
        nameList.add("Prasad");
        nameList.add("Tapan");
        nameList.add("Malcolm");
        nameList.add("Jugal");
        nameList.add("Joswin");
    // maintains insertion order and contains unique elements
    LinkedHashSet <String> nameList2 = new LinkedHashSet<String>();
        nameList2.add("Tushar");
        nameList2.add("Dipesh");
        nameList2.add("Prasad");
        nameList2.add("Tushar");
        nameList2.add("Malcolm");
        nameList2.add("Jugal");
        nameList2.add("Jugal");
    
        System.out.println("Displaying Name List having Unique Values");
        nameList.forEach((String nameDisp) -> System.out.println(nameDisp));
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Displaying Name List having Duplicate Values");
        nameList2.forEach((String nameDisp) -> System.out.println(nameDisp));
    }
}
