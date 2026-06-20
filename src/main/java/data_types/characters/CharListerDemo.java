package data_types.characters;

public class CharListerDemo {
    public static void runCharListerDemo() {
     /*   IntStream.range(0, 65536)
            .forEach(i -> IO.println("c[" + i + "]=" + (char) i));
*/
        byte bv = 23;
        short sbv = bv;
        System.out.println(sbv);

        float maxLongF = Long.MAX_VALUE;
        System.out.println("Float max long = " + maxLongF);
        IO.println(-0 == 0.0);
    }
}
