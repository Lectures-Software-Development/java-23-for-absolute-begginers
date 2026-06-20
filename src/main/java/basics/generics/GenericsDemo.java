package basics.generics;

import basics.Gender;
import basics.PerformerImpl;

public class GenericsDemo {
    public static void runGenericsDemo() {
        PerformerImpl john = new PerformerImpl("John", 40, 1.91f, Gender.MALE);
        PerformerImpl jane = new PerformerImpl("Jane", 40, 1.91f, Gender.FEMALE);

        Pair<PerformerImpl, PerformerImpl> duet = Pair.of(john, jane);
        System.out.println(duet);

        Pair<PerformerImpl, Double> netWorth = Pair.of(john, 34_000_000.03);
        System.out.println(netWorth);

        Pair<String, PerformerImpl> johnsGenres = Pair.of("Country-pop", john);
        System.out.println(johnsGenres);
    }
}
