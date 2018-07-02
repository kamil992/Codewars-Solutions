package Codewars;

import java.util.Arrays;

public class FindTheUniqueNumber {
    public static void main(String[] args) {
        double[] a = new double[]{1, 1, 1, 2, 1, 1};

        System.out.println(findUniq(a));
    }

    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        if (arr[0] == arr[arr.length / 2])
            return arr[arr.length - 1];

        return arr[0];
    }
}
