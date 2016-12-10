
package Properties;

import java.util.*;
import java.io.*;

public class Properties_Demo {
    public static void main (String args[]) throws Exception{
        FileReader reader = new FileReader("db.properties");
        // path of db.properties is E:\NIIT Training\My_Java_Programs\Core_Java i.e. the file should reside in the root folder
        
        Properties p = new Properties();
        p.load(reader);
        
        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));
       
    }
}
