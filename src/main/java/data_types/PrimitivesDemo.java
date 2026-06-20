package data_types;

import java.util.Date;

public class PrimitivesDemo {
    public void runPrimitivesDemo() {
        int i = 5;
        int j = 7;
        Date date = new Date();
        int result = add(i, j);
    }

    static int add(int a, int b) {
        String mess = new String("performing add...");
        System.out.println(mess);
        return a + b;
    }
}
