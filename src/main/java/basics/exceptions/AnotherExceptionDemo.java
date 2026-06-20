package basics.exceptions;

import basics.PerformerImpl;

public class AnotherExceptionDemo {
    public static void runAnotherExceptionDemo() {

        try {
            System.out.println("Hello World");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
