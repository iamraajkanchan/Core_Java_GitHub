
package Collections;

import java.util.*;

public class Comparator_Interface_Non_Generic_Age implements Comparator {
    @Override
    public int compare(Object o1, Object o2){
        Comparator_Interface_Non_Generic_Student s1 = (Comparator_Interface_Non_Generic_Student)o1;
        Comparator_Interface_Non_Generic_Student s2 = (Comparator_Interface_Non_Generic_Student)o2;
        
        if(s1.age == s2.age){
            return 0;
        }
        else if(s1.age > s2.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}
