package data_types;

public class AnotherPrimitiveDemo {
    public static void runAnotherPrimitiveDemo() {
        int k = 42;
        int q = 44;

        swap(k, q);

        IO.println("k = " + k);
        IO.println("q = " + q);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
