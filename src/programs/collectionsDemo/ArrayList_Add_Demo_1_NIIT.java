package programs.collectionsDemo;

import programs.utility.Utility;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Add_Demo_1_NIIT {
    public static void main(String[] args) {
        // to understand better use this link http://www.javatpoint.com/ArrayList-in-collection-framework

        List<Integer> partList = new ArrayList<>(3);
        partList.add(1111);
        partList.add(2222);
        partList.add(3333);
        partList.add(4444);// ArrayList Auto Grows
        System.out.println("First Part " + partList.get(0));  //First Item
        partList.add(0, 5555); //Insert an item by index


        for (int i : partList) {
            Utility.printToLogcat(ArrayList_Add_Demo_1_NIIT.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "i : " + i);
        }

    }

}
