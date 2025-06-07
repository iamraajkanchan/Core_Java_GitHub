package programs.collectionsDemo;
import java.util.*;
//import java.util.function.BiConsumer;
public class Put_HashTable_Demo {
    public static void main(String args[]){
        // Contains values based on the keys. 
        // Can contain only unique elements (keys).
        // Cannot contain any null key neither any null values
        // Maintains insertion in descending order.
        // It is synchronized
        Hashtable<Integer, String> name_List_Table = new Hashtable <>();
        name_List_Table.put(1, "Tushar");
        name_List_Table.put(5, "Dipesh");
        name_List_Table.put(3, "Prasad");
        name_List_Table.put(4, "Malcolm");
        name_List_Table.put(2, "Tapan");
        name_List_Table.put(6, "Jugal");
        name_List_Table.put(9, "Avninash");
        name_List_Table.put(8, "Hitesh");
        name_List_Table.put(7, "Ravi");
//      Use block as the lambda's body and use lambda expression
//      name_List_Table.forEach((Integer i, String nameDisp)->(
//                             System.out.println( i + " " + nameDisp)) 
//        );
//      Use anonymous inner class
//        name_List_Table.forEach(new BiConsumer<Integer, String>() {
//            @Override
//            public void accept(Integer i, String nameDisp) {
//                System.out.println( i + " " + nameDisp);
//            }
//        });
            for(Map.Entry name_Map : name_List_Table.entrySet()){
                System.out.println( name_Map.getKey() + " " + name_Map.getValue());
            }
    }
}
