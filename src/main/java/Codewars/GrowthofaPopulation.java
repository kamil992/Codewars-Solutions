package Codewars;

public class GrowthofaPopulation {
    public static void main(String[] args) {
        System.out.println(nbYear(1500, 5, 100, 5000));
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        int year = 0;
        double ppl = p0;
        while (ppl < p) {
            ppl = ppl + (ppl * (percent / 100)) + aug;
            year++;
        }
        return year;
    }
}
