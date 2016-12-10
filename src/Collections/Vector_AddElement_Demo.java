
package Collections;

import java.util.*;

// for details http://www.javatpoint.com/difference-between-arraylist-and-vector

// Vector is synchronized
// Vector increments 100% means doubles the array size if total number of element exceeds than its capacity
// Vector is a legacy class
// Vector follows Enumeration interface to traverse elements. It can also use Iterator 
// Vector is slow because it is synchronized. In multithreading environment, it will hold the other threads in runnable or non-runnable state until current thread releases the lock of object

public class Vector_AddElement_Demo {
    
    public static void main(String args[]){
        Vector <String> name_vector = new Vector <String>(); // Initializing vector
        
        name_vector.add("Tushar"); // method of Collection
        name_vector.addElement("Dipesh"); // method of vector
        name_vector.addElement("Aarti"); // method of vector
        name_vector.addElement("Harbani"); // method of vector
        name_vector.addElement("Jugal"); // method of vector
        name_vector.addElement("Prasad"); // method of vector
        name_vector.addElement("Ravi"); // method of vector
        name_vector.addElement("Tapan"); // method of vector
        name_vector.addElement("Avinash"); // method of vector
        name_vector.addElement("Ivy"); // method of vector
        
        Enumeration name_enumerator = name_vector.elements();
        
        while(name_enumerator.hasMoreElements()){
            System.out.println(name_enumerator.nextElement());
        }
    }
}
