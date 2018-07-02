package Codewars;

import java.util.List;

public class LastElement {
    public static void main(String[] args) {

    }

    public static <T> T last(final List<T> list) {
        return list.get(list.size() - 1);
    }

    public static char last(final String string) {
        char a;
        return a = string.charAt(string.length() - 1);
    }

    public static <T> T last(final T... list) {
        return list[list.length - 1];
    }
}
