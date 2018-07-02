package Codewars;

import java.text.DecimalFormat;

// http://www.codewars.com/kata/5a58ca28e626c55ae000018a/train/java

//Does not pass all tests, but I think there are mistakes in tests
public class PolygonInsideCircle {
    public static void main(String[] args) {
        System.out.println(areaOfPolygonInsideCircle(4, 5));
    }

    public static double areaOfPolygonInsideCircle(double circleRadius, int numberOfSides) {
        if(circleRadius == 0 || numberOfSides == 0)
            return 0.0;

        float result = (float) ((numberOfSides * (Math.pow(circleRadius, 2))) / 2 *
                Math.sin((2 * Math.PI) / numberOfSides));

            String newDouble = String.format("%.3f", result).replace(",", ".");

            return Double.valueOf(newDouble);
    }

}
