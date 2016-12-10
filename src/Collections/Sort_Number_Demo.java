package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sort_Number_Demo {
    public static void main(String args[]){
        ArrayList numberList = new ArrayList<>();
        
        numberList.add(Integer.valueOf(1992));
        numberList.add(Integer.valueOf(1990));
        numberList.add(2014);
        //Collections.sort(numberList);
        Iterator itr = numberList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
       
    }
}
