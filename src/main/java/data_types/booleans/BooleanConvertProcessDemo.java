package data_types.booleans;

public class BooleanConvertProcessDemo {
    private boolean done;

    public static void runBooleanConvertProcessDemo() {
        BooleanConvertProcessDemo cp = new BooleanConvertProcessDemo();
        IO.println("Default Value = " + cp.isDone());
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
