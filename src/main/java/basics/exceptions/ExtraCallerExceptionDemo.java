package basics.exceptions;

public class ExtraCallerExceptionDemo {
    public static void runExtraCallerExceptionDemo() {

        try {
            throw new Exception("This is an extra caller exception demo.");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}

class Caller {
    public void printTTL(String name) throws EmptyPerformerException {
        try {
            System.out.println("this is dummy");        } catch (Exception e) {
            throw new EmptyPerformerException("Performer not found: " + name);
        }

    }
}

class EmptyPerformerException extends Exception {
    public EmptyPerformerException(String message) {
        super(message);
    }
}