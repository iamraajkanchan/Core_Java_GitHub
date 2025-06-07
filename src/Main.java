import programs.dsa.BasicArrayExample;
import programs.dsa.DSAArrayExample;
import programs.patterns.memento.EditorHistory;
import programs.patterns.memento.EditorHistoryFromAI;
import programs.patterns.memento.TextEditor;
import programs.utility.Utility;

public class Main {
    public static void main(String[] args) {
        // simulateBasicArrayExamples();
        // simulateDSAArrayExamples();
        // simulateMementoExample();

        simulateMementoExampleFromAI();
    }

    public static void simulateBasicArrayExamples() {
        Utility.printSeparator();
        BasicArrayExample bae = new BasicArrayExample();
        bae.printArrayElements(bae.booleanValues);
    }

    public static void simulateDSAArrayExamples() {
        Utility.printSeparator();
        DSAArrayExample dae = new DSAArrayExample(new BasicArrayExample());
        dae.insertElementIntoAnArray(9);
        Utility.printSeparator();
        dae.deleteElementFromAnArray(2);
        Utility.printSeparator();
        dae.findMaximumElementOfAnArray(new int[]{2, 4, 6, 8, 10});
        Utility.printSeparator();
        dae.findMinimumElementOfAnArray(new int[]{1, 3, 5, 7, 9});
    }

    public static void simulateMementoExample() {
        TextEditor editor = new TextEditor();
        EditorHistory history = new EditorHistory();

        editor.type("Hello, ");
        history.save(editor); // Save "Hello, "

        editor.type("world!");
        history.save(editor); // Save "Hello, world!"

        // Print current state
        Utility.printToLogcat(Main.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "Content Saved in Editor : " + editor.getContent());

        // Undo once (should restore "Hello, ")
        history.undo(editor);
        Utility.printToLogcat(Main.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "After 1st Undo : " + editor.getContent());

        // Undo again (should restore "")
        history.undo(editor);
        Utility.printToLogcat(Main.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "After 2nd Undo : " + editor.getContent());
    }

    public static void simulateMementoExampleFromAI() {
        TextEditor editor = new TextEditor();
        EditorHistoryFromAI history = new EditorHistoryFromAI();

        // Save initial empty state
        history.save(editor); // Save ""

        editor.type("Hello, ");
        history.save(editor); // Save "Hello, "

        editor.type("world!");
        history.save(editor); // Save "world!"

        // Print current state
        Utility.printToLogcat(Main.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "Content Saved in Editor : " + editor.getContent());

        // Undo once (should restore "Hello, ")
        history.undo(editor);
        Utility.printToLogcat(Main.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "After 1st Undo : " + editor.getContent());

        // Undo again (should restore "")
        history.undo(editor);
        Utility.printToLogcat(Main.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "After 2nd Undo : " + editor.getContent());
    }
}
