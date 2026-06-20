package basics;

import java.util.List;

public class Java_Syntax {
    public static void runJavaSyntax() {
        List<String> items = List.of("Andrew", "James", "Kamoga", "Zaalwango");

        items.forEach(System.out::println);
    }
}
