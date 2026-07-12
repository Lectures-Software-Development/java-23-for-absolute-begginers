package data_types.wrapper_classes.threads;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {
    public static void main() {
        var rdc = new RandomDurationCallable();
        try (var executor = Executors.newFixedThreadPool(10)) {
            var assignment = new ArrayList<RandomDurationCallable>();
            for (var i = 0; i < 10; i++) {
                assignment.add(rdc);
            }
            try {
                executor.invokeAll(assignment);
            } catch (InterruptedException _) {
            }
        }


    }
}


class RandomDurationCallable implements Callable<Boolean> {
    @Override
    public Boolean call() {
        IO.println(Thread.currentThread().getName() + " started...");
        for (int i = 0; i < 10; ++i) {
            try {
                Thread.sleep(i * 10);
            } catch (InterruptedException _) {

            }
            IO.println(Thread.currentThread().getName() + " ended.");
            return true; //assume done.
        }
        return null;
    }
}