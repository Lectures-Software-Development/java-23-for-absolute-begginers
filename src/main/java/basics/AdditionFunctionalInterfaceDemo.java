package basics;

@FunctionalInterface
interface Operation {
    int excute(int a, int b);
}

public class AdditionFunctionalInterfaceDemo implements Operation {
    @Override
    public int excute(int a, int b) {
        return a + b;
    }
}
