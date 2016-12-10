package Collections;
import java.util.*;
public class Add_LinkedList_Demo {
    public static void main(String args[]){
        LinkedList <String> nameList = new LinkedList<>();
        nameList.add("Tushar");
        nameList.add("Dipesh");
        nameList.add("Prasad");
        nameList.add("Tapan");
        nameList.add("Malcolm");
        nameList.add("Jugal");
        nameList.add("Joswin");
        
        nameList.forEach((String nameDisp) -> (
                System.out.println(nameDisp))
                );
    }
}
