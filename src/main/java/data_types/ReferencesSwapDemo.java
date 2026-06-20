package data_types;

public class ReferencesSwapDemo {
    public static void runReferencesSwapDemo() {
        ReferenceTypes k = new ReferenceTypes(42);
        ReferenceTypes q = new ReferenceTypes(44);

        swap(k, q);

        IO.println("***************************************");
        IO.println("k = " + k.getValue());
        IO.println("q = " + q.getValue());
    }

    static void swap(ReferenceTypes a, ReferenceTypes b) {
        ReferenceTypes temp = new ReferenceTypes(a.getValue());
        a.setValue(b.getValue());
        b.setValue(temp.getValue());
    }
}
