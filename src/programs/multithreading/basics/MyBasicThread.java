package programs.multithreading.basics;

import java.util.concurrent.TimeUnit;

public class MyBasicThread extends Thread {

    private long sleepTime = TimeUnit.SECONDS.toMillis(2);

    public MyBasicThread(String name) {
        super(name);
    }

    public MyBasicThread(Runnable runnable, String name) {
        super(runnable, name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(sleepTime);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Name : " + Thread.currentThread().getName() + " :: State : " + Thread.currentThread().getState() + " :: Priority : " + Thread.currentThread().getPriority() + " :: i : " + i);
            Thread.yield();
        }
    }

    public void setThreadPriority(int priority) {
        this.setPriority(priority);
    }

    public void setThreadSleepTime(long time) {
        this.sleepTime = TimeUnit.SECONDS.toMillis(time);
    }
}
