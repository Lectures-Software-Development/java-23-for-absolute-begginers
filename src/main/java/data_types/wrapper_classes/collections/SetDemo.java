package data_types.wrapper_classes.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetDemo {
    public static void runSetDemo() {
        Set<Ball> ballSet = new HashSet<>();
        ballSet.add(new Ball(2, "RED", "rubber"));
        ballSet.add(new Ball(3, "GREEN", "rubber"));

        IO.println("Set size: " + ballSet.size());
        Ball duplicate = new Ball(2, "RED", "rubber");
        boolean wasAdded = ballSet.add(duplicate);

        if(!wasAdded) {
            IO.println("Duplicate ball was not added to the set.");
        } else {
            IO.println("Duplicate ball was added to the set.");
        }

        IO.println("*****************************************");
        IO.println(ballSet.hashCode());
    }
}