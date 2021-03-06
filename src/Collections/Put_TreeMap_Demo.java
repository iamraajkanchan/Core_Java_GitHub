package Collections;
import java.util.*;
//import java.util.function.BiConsumer;
public class Put_TreeMap_Demo {
    public static void main(String args[]){
        // Contains values based on the keys. 
        // Can contain only unique elements (keys).
        // Cannot contain null key but can have multiple null values
        // Maintains insertion in ascending order.    
        TreeMap<Integer, String> name_List_Map = new TreeMap <>();
        name_List_Map.put(1, "Tushar");
        name_List_Map.put(5, "Dipesh");
        name_List_Map.put(3, "Prasad");
        name_List_Map.put(4, "Malcolm");
        name_List_Map.put(2, "Tapan");
        name_List_Map.put(6, "Jugal");
        name_List_Map.put(9, "Avninash");
        name_List_Map.put(8, "Hitesh");
        name_List_Map.put(7, "Ravi");
//      Use block as the lambda's body and use lambda expression
//      name_List_Map.forEach((Integer i, String nameDisp)->(
//                             System.out.println( i + " " + nameDisp)) 
//        );
//      Use anonymous inner class
//        name_List_Map.forEach(new BiConsumer<Integer, String>() {
//            @Override
//            public void accept(Integer i, String nameDisp) {
//                System.out.println( i + " " + nameDisp);
//            }
//        });
            for(Map.Entry name_Map : name_List_Map.entrySet()){
                System.out.println( name_Map.getKey() + " " + name_Map.getValue());
            }
    }
}
