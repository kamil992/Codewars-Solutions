package Codewars;

import org.hamcrest.Matcher;

public class ProductOfConsecutiveFibNumbers {

    public static void main(String[] args) {

        for (long a : productFib(5895)) {
            System.out.println(a);
        }

    }

    public static long[] productFib(long prod) {

        if (prod < 3) {
            return new long[]{1, 1, 1};
        }

        for (int i = 1; i < 99; i++) {
            if (getFibboNums(i) * getFibboNums(i + 1) == prod) {

                return new long[]{getFibboNums(i), getFibboNums(i + 1), 1};
            }

            if (getFibboNums(i) * getFibboNums(i + 1) < prod
                    && getFibboNums(i + 1) * getFibboNums(i + 2) > prod) {
                return new long[]{getFibboNums(i + 1), getFibboNums(i + 2), 0};
            }
        }
        return new long[]{};
    }

    public static long getFibboNums(int n) {
        long n1 = 0;
        long n2 = 1;
        long n3 = 0;
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
}
