
package Collections;

import java.util.*;

public class Comparator_Interface_Non_Generic_Name implements Comparator {
    @Override
    public int compare(Object o1, Object o2){
    
        Comparator_Interface_Non_Generic_Student s1 = (Comparator_Interface_Non_Generic_Student)o1; 
        Comparator_Interface_Non_Generic_Student s2 = (Comparator_Interface_Non_Generic_Student)o2;
        
        return s1.name.compareTo(s2.name); //compareTo() is a method of String Class, which internally provides the comparison logic
    }

}
