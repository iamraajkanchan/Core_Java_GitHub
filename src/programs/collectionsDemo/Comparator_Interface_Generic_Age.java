
package programs.collectionsDemo;

import java.util.*;

public class Comparator_Interface_Generic_Age implements Comparator <Comparator_Interface_Generic_Student> {
    
    @Override
    public int compare(Comparator_Interface_Generic_Student St1, Comparator_Interface_Generic_Student St2){
        if(St1.age == St2.age){
            return 0;
        }
        else if (St1.age > St2.age){
            return 1;
        }
        else{
            return -1;
        }
    }

}
