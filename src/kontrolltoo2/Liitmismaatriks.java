package kontrolltoo2;

import java.util.Arrays;

/**
 * Created by Evelin.Jogi on 3.02.2016.
 */
public class Liitmismaatriks {
    public static void main(String[] args) {
        int[][] res = liitmistabel (9);

    }

    private static int[][] liitmistabel(int n) {
        int[][] tulemus = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tulemus[i][j] = i + j;
            }
            System.out.println(Arrays.toString(tulemus[i]));
        }
        return tulemus;
    }
}
