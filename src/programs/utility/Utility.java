package programs.utility;

import java.util.Currency;
import java.util.Locale;

public class Utility {

    private static final String OPTION_TAG = "MyJavaPrograms";
    private static final String rupeeSymbol = Currency.getInstance(CurrencyCode.INDIAN).getSymbol(new Locale(LanguageCode.ENGLISH, CountryCode.INDIAN));

    public static void printToLogcat(Class<?> klass, StackTraceElement element, String message) {
        if (element != null) {
            System.out.println(OPTION_TAG + " :: " + klass.getSimpleName() + " :: " + "Line Number :: " + element.getLineNumber() + " :: " + element.getMethodName() + " :: " + message);
        }
    }

    public static void printSeparator() {
        System.out.println("====================================================================================");
    }

    public static String printDoubleAmountWithRupeeSymbol(Double amount) {
        if (amount == null) {
            return rupeeSymbol + " 0.0";
        } else {
            return rupeeSymbol + " " + amount;
        }
    }
}