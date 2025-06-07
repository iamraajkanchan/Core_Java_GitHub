
package programs.collectionsDemo;

public class Comparable_Interface_Student_Demo implements Comparable <Comparable_Interface_Student_Demo> {
int rollNumber;
int age;
String firstName;
String lastName;

    public Comparable_Interface_Student_Demo(int rollNumber, int age, String firstName, String lastName) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }
@Override
public int compareTo(Comparable_Interface_Student_Demo st){
    if(age == st.age){
        return 0;
    }
    else if(age < st.age){
        return 1;
    }
    else{
        return -1;
    }
}
}
    

