package data_types.wrapper_classes.threads;

public class RunnableDemo {
    public static void main() {
        for (int i = 0; i < 5; i++) {
            new Thread(new RandomDurationRunnable()).start();
        }
    }
}