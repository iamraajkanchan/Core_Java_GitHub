package programs.multithreading.basics;

import java.util.concurrent.TimeUnit;

public class TestCounter {
    private int counter = 0;

    public void increment() {
        for (int i = 0; i < 100; i++) {
            counter++;
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(3));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void getCounter() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Counter: " + this.counter);
    }
}
