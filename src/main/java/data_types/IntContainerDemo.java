package data_types;

public class IntContainerDemo {
    public static void runIntContainerDemo() {
        ReferenceTypes k = new ReferenceTypes(42);
        ReferenceTypes q = new ReferenceTypes(44);

        swap(k, q);
        IO.println("k = " + k.getValue());
        IO.println("q = " + q.getValue());
    }

    static void swap(ReferenceTypes a, ReferenceTypes b) {
        ReferenceTypes temp = a;
        a = b;
        b = temp;
    }
}