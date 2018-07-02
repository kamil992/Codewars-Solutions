package Codewars;

public class TenMinWalk {
    public static void main(String[] args) {
        char[] a = new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'};
        char[] b = new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'};

        System.out.println(isValid(b));
    }

    public static boolean isValid(char[] walk) {
        int counter = 1;
        if (walk.length == 10) {
            for (int i = 0; i < walk.length - 1; i++) {
                if (walk[i] != walk[i + 1])
                    counter++;
            }
        }
        if (counter == 10)
            return true;
        return false;
    }
}
