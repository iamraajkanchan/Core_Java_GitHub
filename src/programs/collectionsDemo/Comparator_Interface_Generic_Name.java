
package programs.collectionsDemo;

import java.util.*;

public class Comparator_Interface_Generic_Name implements Comparator <Comparator_Interface_Generic_Student> {
    
    @Override
    public int compare(Comparator_Interface_Generic_Student St1, Comparator_Interface_Generic_Student St2){
        return St1.name.compareTo(St2.name); // compareTo() is method of String class, which internally provides the comparison logic
    }
}
