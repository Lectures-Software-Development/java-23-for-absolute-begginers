package data_types.arrays;

public class CubeDemo {
    public static void runCubeDemo() {
        // Three dimensional array with three coordinates
        int[][][] intMatrix3 = new int[2][2][2];

        for (int i = 0; i < intMatrix3.length; ++i) {
            for (int j = 0; j < intMatrix3[i].length; ++j) {
                for (int k = 0; k < intMatrix3[i][j].length; ++k) {
                    intMatrix3[i][j][k] = i + j + k;
                    IO.print("[" + i + ", " + j + ", " + k + "]");
                }
                IO.println();
            }
            IO.println();
        }
    }
}
