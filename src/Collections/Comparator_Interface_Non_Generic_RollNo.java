
package Collections;

import java.util.*;
public class Comparator_Interface_Non_Generic_RollNo implements Comparator {
    @Override
    public int compare(Object o1, Object o2){
        Comparator_Interface_Non_Generic_Student st1 = (Comparator_Interface_Non_Generic_Student) o1;
        Comparator_Interface_Non_Generic_Student st2 = (Comparator_Interface_Non_Generic_Student) o2;
        if(st1.rollNumber == st2.rollNumber){
            return 0;
    }
        else if(st1.rollNumber > st2.rollNumber){
            return 1;
    }
        else{
            return -1;
    }
    }

}
