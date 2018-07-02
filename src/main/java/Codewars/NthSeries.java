package Codewars;

import java.math.BigDecimal;

public class NthSeries {
    public static void main(String[] args) {
        System.out.println(seriesSum(5));

        double a = 1.5697802197802198;
        BigDecimal bD = new BigDecimal(a).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(bD);
        System.out.format("%.2f%n", a);

    }

    public static String seriesSum(int n) {
        double sum = 1;
        double div = 4;
        for (double i = 1; i < n; i++) {
            sum = sum + (1 / div);
            div += 3;
        }
        BigDecimal bD = new BigDecimal(sum).setScale(2, BigDecimal.ROUND_HALF_UP);
        return bD + "";
    }
}
