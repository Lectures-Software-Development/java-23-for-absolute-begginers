package data_types.wrapper_classes.threads;

public class RunnableDemo {
    void main() {
        for (int i = 0; i < 10; i++) {
            new Thread(new RandomDurationRunnable()).start();
        }
    }
}
