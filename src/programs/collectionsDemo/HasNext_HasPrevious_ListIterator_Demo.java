package programs.collectionsDemo;

import java.util.*;
public class HasNext_HasPrevious_ListIterator_Demo {
    public static void main(String args[]){
        List <String> female_List =  new ArrayList <>();
        List <String> male_List = new ArrayList <>();
        List <String> name_List = new ArrayList <>();
        
        female_List.add("Harbani");
        female_List.add("Aditi");
        female_List.add("Amishree");
        female_List.add("Sonali");
        female_List.add("Naomi");
        female_List.add("Archana");
        female_List.add("Bushra");
        
        male_List.add("Jugal");
        male_List.add("Tushar");
        male_List.add("Dipesh");
        male_List.add("Prasad");
        male_List.add("Tapan");
        male_List.add("Malcolm");
        male_List.add("Hitesh");
        male_List.add("Minaal");
        male_List.add("Ravi");
        //Collection<? extends String> female_list = null;
        //name_List.addAll(female_list); Note when you can define the elements then you to define in the above manner
        name_List.addAll(female_List);
        name_List.addAll(male_List);
        ListIterator <String> nameDisp = name_List.listIterator();
        // Traversing in forward direction
        System.out.println("Traversing in forward direction");
        while(nameDisp.hasNext()){
            System.out.println(nameDisp.next());
        }
        // Traversing in backward direction
        System.out.println("Traversing in backward direction");
        while(nameDisp.hasPrevious()){
            System.out.println(nameDisp.previous());
        }
    }    
}
