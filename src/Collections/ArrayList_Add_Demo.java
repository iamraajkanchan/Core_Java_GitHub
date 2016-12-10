package Collections;

    import java.util.*;
    public class ArrayList_Add_Demo {
        public static void main(String args[]){
            ArrayList <String> nameList = new ArrayList <String> ();
               nameList.add("Jugal");
               nameList.add("Aditi");
               nameList.add("Amishree");
               nameList.add("Krishh");
               nameList.add("Tapan");
               nameList.add("Chintamani");
               nameList.add("Tushar");
               nameList.add("Dipesh");
               nameList.add("Prasad");
            // Using iterator to 
            //Iterator itr = nameList.iterator();
            //while(itr.hasNext()){
            //    System.out.println(itr.next());
            //}
            for(String itr: nameList){
                System.out.println(itr);
            }
        }
    }
