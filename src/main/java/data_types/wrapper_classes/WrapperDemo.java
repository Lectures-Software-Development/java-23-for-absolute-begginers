package data_types.wrapper_classes;

public class WrapperDemo {
    public static void runWrapperDemo() {
        // upper interval boundary int
        Integer max = Integer.MAX_VALUE;
        System.out.println(max);

        //autoboxing Integer -> int
        int pmax = max;

        //autoboxing Integer -> int
        Integer io = 10;

        //Creating a primitive utitility method
        // Exception is thrown if string is not number
        int i1 = Integer.parseInt("11");

        //Exceptio is thrown, if string is not a number
        Integer i3 = Integer.valueOf("12");

        //Convert int into String
        String s0 = Integer.toString(10);

        //COnvert int to float
        float f0 = Integer.valueOf(14).floatValue();

        //creating string with binary representation of number 9 (1001)
        String s1 = Integer.toBinaryString(9);
        IO.println(s1);

        //introudced in java 1.8
        Integer i4 = Integer.parseUnsignedInt("+15");
        IO.println(i4);

        //method to add two integers
        int sum = Integer.sum(5, 10);
        IO.println(sum);

        //Method to get the bigger value
        int maximum = Integer.max(5, 10);
        IO.println(maximum);
    }
}
