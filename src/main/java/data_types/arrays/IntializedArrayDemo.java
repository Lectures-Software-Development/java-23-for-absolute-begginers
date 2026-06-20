package data_types.arrays;

import java.util.Arrays;

public class IntializedArrayDemo {
    int[] array = new int[2];

    public static void runIntializedArrayDemo() {
        var ad = new IntializedArrayDemo();

        if (ad.array == null) {
            IO.println("Array unusable. Nothing to do.");
            return;
        }

        IO.println("Array was initialized with " + Arrays.toString(ad.array));
    }
}
