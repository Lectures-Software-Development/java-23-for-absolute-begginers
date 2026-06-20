package data_types.strings;

public class SimpleStringDemo {
    public static void runSimpleStringDemo() {
        String str1 = "This is quite good and it will.\n";
        IO.println(str1.stripLeading());
        String perf = "The singers performing tonight are: \n\t Paolo Nutini \n\t Seth MacFarlane \n\t The Weeknd \n\t Dua Lipa \n\t Ed Sheeran \n\t Taylor Swift \n\t Adele \n\t Bruno Mars \n\t Justin Bieber \n\t Ariana Grande";
        IO.println(perf.stripIndent());
    }
}
