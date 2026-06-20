package data_types.numeric_types;

public class NumericDemo {
    private byte b;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;

    public static void runNumericDemo() {
        NumericDemo numericDemo = new NumericDemo();

        numericDemo.b = 0b1100;
        System.out.println("byte b = " + numericDemo.b);

        numericDemo.i = 42;

        numericDemo.i = 045;
        System.out.println("int i = " + numericDemo.i);

        numericDemo.i = 0xcafe;
        System.out.println("int hexadecimal value:= " + numericDemo.i);


        numericDemo.i = 0b10101010101010101010101010101011;
        System.out.println("Int binary value: " + numericDemo.i);
        // Java 7 syntax
        numericDemo.i = 0b1010_1010_1010_1010_1010_1010_1010_1011;
        System.out.println("Int binary value: " + numericDemo.i);

        numericDemo.l = 1000_000l; // equivalent to 1000_000L
        System.out.println("Long value: " + numericDemo.l);

        numericDemo.f = 5;
        System.out.println("Integer value assigned to a float variable: " + numericDemo.f);

        numericDemo.f = 2.5f; // equivalent to numericDemo.f = 2.5F;
        System.out.println("Decimal value assigned to a float variable: " + numericDemo.f);

        numericDemo.d = 2.5d; // equivalent to numericDemo.d = 2.5D;
        System.out.println("Decimal value assigned to a double variable: " + numericDemo.d);

    }
}
