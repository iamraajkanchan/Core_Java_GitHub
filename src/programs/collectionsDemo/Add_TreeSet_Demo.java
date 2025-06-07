package programs.collectionsDemo;

import java.util.*;

public class Add_TreeSet_Demo {
public static void main(String args[]){
    // maintains ascending order and contains unique elements
    TreeSet <String> nameList = new TreeSet<String>();
        nameList.add("Tushar");
        nameList.add("Dipesh");
        nameList.add("Prasad");
        nameList.add("Tapan");
        nameList.add("Malcolm");
        nameList.add("Jugal");
        nameList.add("Joswin");
    // maintains ascending order and contains unique elements
    TreeSet <String> nameList2 = new TreeSet<String>();
        nameList2.add("Tushar");
        nameList2.add("Dipesh");
        nameList2.add("Prasad");
        nameList2.add("Tushar");
        nameList2.add("Malcolm");
        nameList2.add("Jugal");
        nameList2.add("Jugal");
    
        System.out.println("Displaying name list in ascending order having unique values");
        nameList.forEach((String nameDisp) -> (
                System.out.println(nameDisp)
                ));
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Displaying name list in ascending order having duplicate values");
        nameList2.forEach((String nameDisp) -> (
                System.out.println(nameDisp)
                ));
    }
}
