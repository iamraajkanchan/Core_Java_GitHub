
package programs.collectionsDemo;

import java.util.*;


public class Comparator_Interface_Generic_Demo {
    
    public static void main(String args[]){
        Comparator_Interface_Generic_Student student1 = new Comparator_Interface_Generic_Student(101, 14, "Aarti Kumawat");
        Comparator_Interface_Generic_Student student2 = new Comparator_Interface_Generic_Student(103, 17, "Tushar Khawaskhane");
        Comparator_Interface_Generic_Student student3 = new Comparator_Interface_Generic_Student(102, 13, "Ivy Fernandes");
        Comparator_Interface_Generic_Student student4 = new Comparator_Interface_Generic_Student(104, 15, "Dipesh Bari");
        Comparator_Interface_Generic_Student student5 = new Comparator_Interface_Generic_Student(106, 16, "Piyush Singh");
        Comparator_Interface_Generic_Student student6 = new Comparator_Interface_Generic_Student(105, 12, "Harbani Bhamra");
        
        ArrayList studentList = new ArrayList<>();
        
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        
        System.out.println("Sorting on the basis of Roll Number...");
        System.out.println("");
        Collections.sort(studentList, new Comparator_Interface_Generic_RollNo());
        Iterator it_rollno = studentList.iterator();
        while(it_rollno.hasNext()){
            Comparator_Interface_Generic_Student dispStudent = (Comparator_Interface_Generic_Student)it_rollno.next();
            System.out.println( dispStudent.rollNumber + " " + dispStudent.age + " " + dispStudent.name);
        }
        
        System.out.println("Sorting on the basis of Age...");
        System.out.println("");
        Collections.sort(studentList, new Comparator_Interface_Generic_Age());
        Iterator it_age = studentList.iterator();
        while(it_age.hasNext()){
            Comparator_Interface_Generic_Student dispStudent = (Comparator_Interface_Generic_Student) it_age.next();
            System.out.println( dispStudent.rollNumber + " " + dispStudent.age + " " + dispStudent.name);
        }
        
        System.out.println("Sorting on the basis of Name...");
        System.out.println("");
        Collections.sort(studentList, new Comparator_Interface_Generic_Name());
        Iterator it_name = studentList.iterator();
        while(it_name.hasNext()){
            Comparator_Interface_Generic_Student dispStudent = (Comparator_Interface_Generic_Student) it_name.next();
            System.out.println( dispStudent.rollNumber + " " + dispStudent.age + " " + dispStudent.name);
        }
    }

}
