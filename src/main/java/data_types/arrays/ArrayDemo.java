package data_types.arrays;

import java.util.Arrays;

public class ArrayDemo {
    int array[];

    public static void runArrays() {
        ArrayDemo ad = new ArrayDemo();

        if (ad.array == null) {
            IO.println("Array unusable. Nothing to do.");
            return;
        }

        IO.println("Array was initialized with " + Arrays.toString(ad.array));
    }
}
