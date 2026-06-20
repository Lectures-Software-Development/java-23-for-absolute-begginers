package data_types.wrapper_classes.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void runMapDemo() {
        Map<Ball, Integer> ballMap = new HashMap<>();
        ballMap.put(new Ball(2, "rubber", "RED"), 5);
        ballMap.put(new Ball(3, "Cotton", "BLUE"), 7);
        Ball blueBall = new Ball(3, "Cotton", "BLUE");

        ballMap.putAll(Map.of(
            new Ball(4, "Leather", "GREEN"), 10,
            new Ball(5, "Plastic", "YELLOW"), 12,
            new Ball(6, "Foam", "WHITE"), 15
        ));

        ballMap.putIfAbsent(blueBall, 20);

        for(Map.Entry<Ball, Integer> entry : ballMap.entrySet()) {
            IO.println(entry.getKey() + " " + entry.getValue());
        }

        IO.println("*****************************************");
        ballMap.forEach((ball, quantity) -> IO.println(ball + ": " + quantity));
    }
}
