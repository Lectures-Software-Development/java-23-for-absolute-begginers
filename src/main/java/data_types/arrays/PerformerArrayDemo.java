package data_types.arrays;

import basics.Gender;
import basics.PerformerImpl;

public class PerformerArrayDemo {
    public static void runPerformerArrayDemo() {
        PerformerImpl[] arrayDemos = new PerformerImpl[3];
       /* PerformerImpl[] arrayDemos = {
            new PerformerImpl("John", 43, 1.9f, Gender.MALE, "Namasagali Univerity", "Afrobeat"),
            new PerformerImpl("Jane", 35, 1.4f, Gender.FEMALE,"Bugema School of Music", "Gospel"),
            new PerformerImpl("Bob", 50, 1.8f, Gender.MALE, "Kampala School of Perfoming Arts", "Classic")
        };*/

        for (int i = 0; i < arrayDemos.length; ++i) {
            IO.println("Performer[" + i + "] = " + arrayDemos[i]);
        }

        IO.println("*******************************************************");

        arrayDemos[0] = new PerformerImpl("John",43, 1.9f, Gender.MALE);
        arrayDemos[1] = new PerformerImpl("Jane", 35, 1.4f, Gender.FEMALE);
        arrayDemos[2] = new PerformerImpl("Bob", 50, 1.8f, Gender.MALE);

        for (int i = 0; i < arrayDemos.length; ++i) {
            IO.println("Performer[" + i + "] = " + arrayDemos[i].getName());
        }

    }

}
