import programs.dsa.BasicArrayExample;
import programs.dsa.DSAArrayExample;
import programs.multithreading.basics.MyBasicThread;
import programs.multithreading.basics.TestCounter;
import programs.patterns.adapter.AudioPlayer;
import programs.patterns.decorator.DecoratorFarmHousePizza;
import programs.patterns.memento.EditorHistory;
import programs.patterns.memento.EditorHistoryFromAI;
import programs.patterns.memento.TextEditor;
import programs.utility.Utility;

public class Main {
    public static void main(String[] args) {
        // simulateBasicArrayExamples();
        // simulateDSAArrayExamples();
        // simulateMementoExample();
        // simulateMementoExampleFromAI();
        // simulateAdapterDemoExample();
        simulateDecoratorPatternExample();
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

    private static void simulateAdapterDemoExample() {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "song.mp3");  // Direct play without adapter
        player.play("mp4", "movie.mp4"); // Uses MP4 adapter
        player.play("vlc", "video.vlc"); // Uses VLC adapter
    }

    private static void simulateMyBasicThread() {
        MyBasicThread firstThread = new MyBasicThread("firstThread");
        MyBasicThread secondThread = new MyBasicThread("secondThread");
        MyBasicThread thirdThread = new MyBasicThread("thirdThread");
        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }

    private static void simulateTestCounterWithThread() {
        TestCounter testCounter = new TestCounter();
        Runnable incrementCounterTask = testCounter::increment;
        Runnable readCounterTask = testCounter::getCounter;

        Thread firstIncrementCounterThread = new Thread(incrementCounterTask, "firstIncrementCounterThread");
        Thread secondIncrementCounterThread = new Thread(incrementCounterTask,"secondIncrementCounterThread");
        Thread thirdIncrementCounterThread = new Thread(incrementCounterTask,"thirdIncrementCounterThread");

        Thread firstReadCounterThread = new Thread(readCounterTask, "firstReadCounterThread");
        Thread secondReadCounterThread = new Thread(readCounterTask,"secondReadCounterThread");
        Thread thirdReadCounterThread = new Thread(readCounterTask,"thirdReadCounterThread");

        firstIncrementCounterThread.start();
        secondIncrementCounterThread.start();
        thirdIncrementCounterThread.start();
        try {
            firstIncrementCounterThread.join();
            secondIncrementCounterThread.join();
            thirdIncrementCounterThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        firstReadCounterThread.start();
        secondReadCounterThread.start();
        thirdReadCounterThread.start();
    }

    private static void simulateDecoratorPatternExample() {
        DecoratorFarmHousePizza farmHousePizza = new DecoratorFarmHousePizza();
        System.out.println("FarmHouse Pizza Cost before updating : " + Utility.printDoubleAmountWithRupeeSymbol(farmHousePizza.getPizzaCost()));
        farmHousePizza.updateCost(30);
        System.out.println("FarmHouse Pizza Cost after updating : " + Utility.printDoubleAmountWithRupeeSymbol(farmHousePizza.getPizzaCost()));
    }
}
