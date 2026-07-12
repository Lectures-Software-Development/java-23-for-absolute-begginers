package data_types.wrapper_classes.threads;

import static java.lang.Thread.sleep;

public class LambdaThreadsDemo {
    public static void runLambdaThreadsDemo() {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                IO.println(Thread.currentThread().getName() + " started...");
                for (int j = 0; j < 5; j++) {
                    try {
                        sleep(j * 10);
                    } catch (InterruptedException e) {
                        IO.println(Thread.currentThread().getName()
                                + " was interrupted.");
                    }
                    IO.println(Thread.currentThread().getName()
                            + "The current thread slept for "
                            + j * 10 + " milliseconds.");
                }
            }).start();
        }
    }
}
