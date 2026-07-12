package data_types.wrapper_classes.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Compares three ways to run the SAME task (RandomDurationRunnable) concurrently:
 *   1. Raw threads          -> new Thread(task).start()   (see RunnableDemo)
 *   2. A fixed thread pool  -> reuse a few platform threads for many tasks
 *   3. Virtual threads      -> one cheap thread per task (Project Loom)
 *
 * The task never changes. Only the machinery that runs it changes. That is the
 * whole payoff of coding to Runnable instead of extending Thread.
 */
public class ExecutorServiceDemo {

    public static void runExecutorServiceDemo() {
        //rawThreads();
        //fixedThreadPool();
        virtualThreads();
    }

    /**
     * 1. Baseline: 10 tasks -> 10 brand-new operating-system threads.
     * Simple, but creating a platform thread is expensive (~1 MB stack each),
     * and there is no easy way to wait for them all or reuse them.
     */
    private static void rawThreads() {
        IO.println("\n--- 1. Raw threads ---");
        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[2000];

        for (int i = 0; i < threads.length; i++) {
//            new Thread(new RandomDurationRunnable()).start();
            threads[i] = new Thread(new RandomDurationRunnable());
            threads[i].start();
        }

        JoinThreadsandPrintEndTime(startTime, threads);
    }

    /**
     * 2. Thread pool: hand 10 tasks to an executor backed by only 3 threads.
     * The 3 workers are reused, so tasks queue and run 3-at-a-time. This is how
     * you cap resource use instead of spawning a thread per task.
     *
     * try-with-resources: ExecutorService is AutoCloseable since Java 19+.
     * close() waits for all submitted tasks to finish before returning, so this
     * block does not exit until the pool is drained — no manual join() needed.
     */
    private static void fixedThreadPool() {
        IO.println("\n--- 2. Fixed thread pool (3 workers, 10 tasks) ---");
        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[2000];
        try (ExecutorService pool = Executors.newFixedThreadPool(2000)) {
            for (int i = 0; i < threads.length; i++) {
                pool.submit(new RandomDurationRunnable());
            }
        } // <- close() blocks here until every task completes

        long endTime = System.currentTimeMillis();
        IO.println("Execution time: " + (endTime - startTime) + " ms");
    }

    /**
     * 3. Virtual threads (stable since Java 21): the executor creates one new
     * virtual thread per task. Virtual threads are managed by the JVM, not the
     * OS, so they are cheap enough to have millions. Same Runnable, no changes.
     */
    private static void virtualThreads() {
        
        IO.println("\n--- 3. Virtual thread per task ---");
        long startTime = System.currentTimeMillis();
        try (ExecutorService pool = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 2000; i++) {
                pool.submit(new RandomDurationRunnable());
            }

        }

        long endTime = System.currentTimeMillis();
        IO.println("Execution time: " + (endTime - startTime) + " ms");
    }

    private static void JoinThreadsandPrintEndTime(long startTime, Thread[] threads) {
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                IO.println("Thread was interrupted.");
                return;
            }
        }
        long endTime = System.currentTimeMillis();
        IO.println("Execution time: " + (endTime - startTime) + " ms");
    }
}
