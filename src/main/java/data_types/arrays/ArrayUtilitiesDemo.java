package data_types.arrays;

import java.util.Arrays;

public class ArrayUtilitiesDemo {
    public static void runArrayUtilitiesDemo() {
        int[] array = {4, 2,7,10,99,5};
        IO.println(array.length);
        IO.println(Arrays.toString(array));

        Arrays.stream(array).forEach(ai -> IO.println(ai));

        Arrays.sort(array);
        IO.println(Arrays.toString(array));

        array = new int[]{4, 2,1,100,45,33,5,19,40,8,10, 7};
        Arrays.sort(array);
        IO.println(array.length);
        int foundAt = Arrays.binarySearch(array, 19);
        IO.println("Key found at: " + foundAt);
    }
}
