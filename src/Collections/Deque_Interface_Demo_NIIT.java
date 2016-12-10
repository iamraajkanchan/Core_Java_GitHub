package Collections;

import java.util.*;



public class Deque_Interface_Demo_NIIT 
{
    public static void main(String[] args) 
    {
        //For Lifo we have to use push and pop method
        Deque<String> stack=new ArrayDeque<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        
        
//        for (String s : stack) {
//            System.out.println(s);
//        }
       for(int i=0;i<3;i++)
       {
            System.out.println(stack.pop());
       }
       
        System.out.println("");
        
       /*
        //For Fifo we have to use add and remove method
        
        Deque<String> stack1=new ArrayDeque<>();
        stack1.add("one");
        stack1.add("two");
        stack1.add("three");
        
        
        for(String s:stack1)
        {
            System.out.println(s);
        }
        */
    }
    
}
