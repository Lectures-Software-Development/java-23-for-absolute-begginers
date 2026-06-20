package data_types.arrays;

public class MatrixDemo {
    public static void runMatrixDemo() {
        // Multi dimentional arrays
        int[][] intMatrix2 = new int[2][2];

        for (int i = 0; i < intMatrix2.length; ++i) {
            for (int j = 0; j < intMatrix2[i].length; j++) {
                intMatrix2[i][j] = i + j;
                IO.print(intMatrix2[i][j] + " ");
            }
            IO.println();
        }
    }

}
