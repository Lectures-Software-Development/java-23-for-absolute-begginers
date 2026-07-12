package data_types.wrapper_classes.threads;

public class MultipleUserThreadsDemo {
    public static void main() {
        for (int i = 0; i < 10; i++) {
            new RandomDurationThread().start();
        }
    }
}
