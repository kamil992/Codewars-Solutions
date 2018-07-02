package Codewars;

public class PowerSumDig {
    public static void main(String[] args) {
        int a = 512;

        System.out.println(powerSumDigTerm(6));
    }

    //todo
    public static long powerSumDigTerm(int n) {
        long result = 0;
        int num = 0;
        if (n < 4) {
            num = 10 - n;
            result = (long) Math.pow(num, n + 1);
        } else if (n >= 4 && n <= 5) {
            num = 13 + n;
            result = (long) Math.pow(num, 3);
        } else if (n >= 6) {
            num = 20 + n;
            result = (long) Math.pow(num, 3);
        }

        return result;
    }
}
