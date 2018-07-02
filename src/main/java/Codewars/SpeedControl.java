package Codewars;

import java.util.Arrays;

public class SpeedControl {
    public static void main(String[] args) {
        double[] x = new double[]{0.0, 0.18, 0.36, 0.54, 0.72, 1.05, 1.26, 1.47, 1.92, 2.16, 2.4, 2.64,
                2.88, 3.12, 3.36, 3.6, 3.84};
        System.out.println(gps(20, x));
    }

    public static int gps(int s, double[] x) {
        long val = 0;
        double[] a = new double[x.length];
        if (x.length <= 1) {
            return 0;
        }
        double road = 0;
        for (int i = 0; i < x.length - 1; i++) {
            val = (int) ((x[i + 1] - x[i]) * 3600) / s;
            a[i] = val;
        }
        Arrays.sort(a);

        return (int) a[a.length - 1];
    }
}
