
package Collections;

import java.util.*;

public class Comparator_Interface_Generic_RollNo implements Comparator <Comparator_Interface_Generic_Student> {
    
    @Override
    public int compare(Comparator_Interface_Generic_Student St1 , Comparator_Interface_Generic_Student St2) {
        if(St1.rollNumber == St2.rollNumber){
            return 0;
        }
        else if (St1.rollNumber > St2.rollNumber){
            return 1;
        }
        else{
            return -1;
        }
    }

}
