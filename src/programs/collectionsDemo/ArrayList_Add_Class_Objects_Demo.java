package programs.collectionsDemo;

import java.util.*;
//import java.util.function.Consumer;


public class ArrayList_Add_Class_Objects_Demo {
    
    public static void main(String args[]){
        
        Student_ArrayList_Add_Objects_Demo stu1 = new Student_ArrayList_Add_Objects_Demo("Jugal", 01, 14);
        Student_ArrayList_Add_Objects_Demo stu2 = new Student_ArrayList_Add_Objects_Demo("Aditi", 02, 14);
        Student_ArrayList_Add_Objects_Demo stu3 = new Student_ArrayList_Add_Objects_Demo("Amishree", 06, 14);
        Student_ArrayList_Add_Objects_Demo stu4 = new Student_ArrayList_Add_Objects_Demo("Harbani", 07, 14);
        Student_ArrayList_Add_Objects_Demo stu5 = new Student_ArrayList_Add_Objects_Demo("Tapan", 8, 14); // why 08 is not a valid value to add in an integer variable
        Student_ArrayList_Add_Objects_Demo stu6 = new Student_ArrayList_Add_Objects_Demo("Tushar", 9, 14);
        Student_ArrayList_Add_Objects_Demo stu7 = new Student_ArrayList_Add_Objects_Demo("Dipesh", 10, 14);
        Student_ArrayList_Add_Objects_Demo stu8 = new Student_ArrayList_Add_Objects_Demo("Prasad", 11, 14);
        
        //ArrayList <Student_ArrayList_Add_Objects_Demo> stuRegister = new ArrayList <Student_ArrayList_Add_Objects_Demo>(); // creating arraylist
        ArrayList <Student_ArrayList_Add_Objects_Demo> stuRegister = new ArrayList <>(); // creating arraylist
        
        stuRegister.add(stu1);
        stuRegister.add(stu2);
        stuRegister.add(stu3);
        stuRegister.add(stu4);
        stuRegister.add(stu5);
        stuRegister.add(stu6);
        stuRegister.add(stu7);
        stuRegister.add(stu8);
//        Iterator itr = stuRegister.iterator();
//        while(itr.hasNext()){
//            Student_ArrayList_Add_Objects_Demo stuDisp = (Student_ArrayList_Add_Objects_Demo)itr.next();
//            System.out.println(stuDisp.stuName + " " + stuDisp.stuRollNo + " " + stuDisp.stuAge);
//        }
//        Using functional operations to display values of elements using foreach method of ArrayList class
//        stuRegister.forEach((stuDisp) -> {
//            System.out.println(stuDisp.stuName + " " + stuDisp.stuRollNo + " " + stuDisp.stuAge);
//        });
//        Convert Lambda Expression to Anonymous Expression Class
//        stuRegister.forEach(new Consumer<Student_ArrayList_Add_Objects_Demo>() {
//            @Override
//            public void accept(Student_ArrayList_Add_Objects_Demo stuDisp) {
//                System.out.println(stuDisp.stuName + " " + stuDisp.stuRollNo + " " + stuDisp.stuAge);
//            }
//        });
//        Turning anonymous inner class into lambda expression
//        stuRegister.forEach((Student_ArrayList_Add_Objects_Demo stuDisp) -> {
//            System.out.println(stuDisp.stuName + " " + stuDisp.stuRollNo + " " + stuDisp.stuAge);
//        });
//        for (Student_ArrayList_Add_Objects_Demo stuDisp : stuRegister) {
//            System.out.println(stuDisp.stuName + " " + stuDisp.stuRollNo + " " + stuDisp.stuAge);
//        }
//      Using iterator with for loop
//        for (Iterator<Student_ArrayList_Add_Objects_Demo> it = stuRegister.iterator(); it.hasNext();) {
//            Student_ArrayList_Add_Objects_Demo stuDisp = it.next();
//            System.out.println(stuDisp.stuName + " " + stuDisp.stuRollNo + " " + stuDisp.stuAge);
//        }
          stuRegister.forEach((Student_ArrayList_Add_Objects_Demo stuDisp) -> {
              System.out.println(stuDisp.stuName + " " + stuDisp.stuRollNo + " " + stuDisp.stuAge);
        });
        
    }/**/
}
