package programs.utility;

public class Utility {

    private static final String APPLICATION_TAG = "ApplicationTag";

    public static void printToLogcat(Class<?> klass, StackTraceElement element, String message) {
        if (element != null) {
            System.out.println(APPLICATION_TAG + " :: " + klass.getSimpleName() + " :: " + "Line Number :: " + element.getLineNumber() + " :: " + element.getMethodName() + " :: " + message);
        }
    }

    public static void printSeparator() {
        System.out.println("======================================================================================================");
    }
}