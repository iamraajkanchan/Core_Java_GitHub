package programs.collectionsDemo;
import java.util.*;

public class Methods_PriorityQueue_Demo {
    public static void main(String args[]){
        // orders the element in first in first out (FIFO) manner 
        PriorityQueue <String> nameQueue = new PriorityQueue <>();
        nameQueue.add("Tushar");
        nameQueue.add("Dipesh");
        nameQueue.add("Prasad");
        nameQueue.add("Tapan");
        nameQueue.add("Malcolm");
        nameQueue.add("Jugal");
        nameQueue.add("Joswin");
        
        System.out.println("Displaying names listed in Name Queue using lamba method");
        nameQueue.forEach((String nameDisp) -> (
                System.out.println(nameDisp))
                );
//        System.out.println("");
//        System.out.println("");
//        System.out.println("Displyaing names listed in Name Queue using while loop");
//        Iterator it = nameQueue.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//      both foreach and iterator method shows up the same result, there is a confusion, please try to figure it out.
        System.out.println("Head Element" + nameQueue.element());
        System.out.println("Peek Element" + nameQueue.peek());
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Displaying names listed in Name Queue after removing two elements using remonve and poll method");
        
        nameQueue.remove(); // retrieves or removes the head of the queue, and it throws NoSuchElementsException 
        nameQueue.poll(); // retrieves or removes the head of the queue
        
        nameQueue.forEach((String nameDisp)->(
                System.out.println(nameDisp))
        );
    }
}
