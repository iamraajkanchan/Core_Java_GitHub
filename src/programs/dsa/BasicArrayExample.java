package programs.dsa;
import org.myProgram.utility.Utility;

public class BasicArrayExample {
    public Integer[] evenNumbers = {2, 4, 6, 8, 10};
    public Integer[] oddNumbers = {1, 3, 5, 7, 9};
    public Character[] vowels = {'a', 'e', 'i', 'o', 'u'};
    public Boolean[] booleanValues = {true, false};
    public String[] optionJargon = {"Long Put", "Short Put", "Long Call", "Short Call"};
    public String[] futureJargon = {};

    public void printArrayElements(Object[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            Utility.printToLogcat(BasicArrayExample.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "Value of " + i + " : " + inputArray[i]);
        }
    }

    public void reverseArrays(Object[] inputArray) {
        Object[] reverseArray = new Object[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            int index = inputArray.length - 1 - i;
            reverseArray[index] = inputArray[i];
        }
        printArrayElements(reverseArray);
    }
}
