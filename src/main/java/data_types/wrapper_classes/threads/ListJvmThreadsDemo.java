package data_types.wrapper_classes.threads;

import data_types.wrapper_classes.collections.Ball;

import java.util.HashMap;
import java.util.Map;

public class ListJvmThreadsDemo {
    public static void runListJvmThreadsDemo() {
        var threadSet = Thread.getAllStackTraces().keySet();
        var threadArray = threadSet.toArray(new Thread[0]);

        for (int i=0; i<threadArray.length; i++) {
            IO.println("Thread name: " + threadArray[i].getName());
        }
        IO.println(threadArray.length + " threads.");
    }
}
