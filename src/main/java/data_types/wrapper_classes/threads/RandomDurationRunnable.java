package data_types.wrapper_classes.threads;

public class RandomDurationRunnable implements Runnable  {
    @Override
    public void run() {
        // Implementation for the runnable task
        IO.println(Thread.currentThread().getName() + " is starting.");

        for(int i = 0; i < 5; i++) {
            try {
                var sleepTime = i * 10;
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                IO.println(Thread.currentThread().getName() + " was interrupted.");
            }
        }

        IO.println(Thread.currentThread().getName() + " has finished.");
    }
}


