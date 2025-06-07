package programs.collectionsDemo;

import java.util.*;
public class Add_HashSet_Demo {

    public static void main(String args[]){
    // do not maintains insertion order and contains unique elements
    HashSet <String> nameList = new HashSet<String>();
        nameList.add("Tushar");
        nameList.add("Dipesh");
        nameList.add("Prasad");
        nameList.add("Tapan");
        nameList.add("Malcolm");
        nameList.add("Jugal");
        nameList.add("Joswin");
    // do not maintains insertion order and contains unique elements
    HashSet <String> nameList2 = new HashSet<String>();
        nameList2.add("Tushar");
        nameList2.add("Dipesh");
        nameList2.add("Prasad");
        nameList2.add("Tushar");
        nameList2.add("Malcolm");
        nameList2.add("Jugal");
        nameList2.add("Jugal");
    
        System.out.println("Displaying Name List having Unique Values");
        nameList.forEach((String nameDisp) -> (
                System.out.println(nameDisp)
                ));
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Displaying Name List having Duplicate Values");
        nameList2.forEach((String nameDisp) -> (
                System.out.println(nameDisp)
                ));
    }
}
