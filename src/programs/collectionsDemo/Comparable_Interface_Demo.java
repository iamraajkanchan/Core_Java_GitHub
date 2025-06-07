//http://www.javatpoint.com/Comparable-interface-in-collection-framework

package programs.collectionsDemo;

import java.util.Collections;
import java.util.ArrayList;

public class Comparable_Interface_Demo {
    public static void main(String args[]){
        ArrayList < Comparable_Interface_Student_Demo > studentList = new ArrayList < Comparable_Interface_Student_Demo >();
                Comparable_Interface_Student_Demo student1 = new Comparable_Interface_Student_Demo(101, 14, "Aarti", "Kumawat");
                Comparable_Interface_Student_Demo student2 = new Comparable_Interface_Student_Demo(102, 16, "Prasad", "Vesvikar");
                Comparable_Interface_Student_Demo student3 = new Comparable_Interface_Student_Demo(103, 13, "Ivy", "Fernandes");
                Comparable_Interface_Student_Demo student4 = new Comparable_Interface_Student_Demo(104, 17, "Tushar", "Khawaskhane");
                Comparable_Interface_Student_Demo student5 = new Comparable_Interface_Student_Demo(105, 15, "Dipesh", "Bari");
                Comparable_Interface_Student_Demo student6 = new Comparable_Interface_Student_Demo(106, 15, "Harbani", "Bhamra");
                
                studentList.add(student1);
                studentList.add(student2);
                studentList.add(student3);
                studentList.add(student4);
                studentList.add(student5);
                studentList.add(student6);
                
                Collections.sort(studentList);
                
                for(Comparable_Interface_Student_Demo displayStudent : studentList){
                    System.out.println(displayStudent.rollNumber + " " + displayStudent.age + " " + displayStudent.firstName + " " + displayStudent.lastName);
                }
                        
    }
}
