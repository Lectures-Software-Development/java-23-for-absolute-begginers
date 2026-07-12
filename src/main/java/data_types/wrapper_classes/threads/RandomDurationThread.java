package data_types.wrapper_classes.threads;

public class RandomDurationThread extends Thread {
    @Override
    public void run() {
        IO.println(this.getName() + " is starting.");
        for(int i = 0; i < 10; i++) {
            try {
                var sleepTime = i * 10;
                Thread.sleep(sleepTime);
                IO.println(this.getName() + " has slept for " + sleepTime + " milliseconds.");
            } catch (InterruptedException e) {
                IO.println(this.getName() + " was interrupted.");
            }
        }
        IO.println(this.getName() + " has finished.");
    }
}
