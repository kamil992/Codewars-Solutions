package Codewars;


import java.util.Arrays;

public class SortTheOdd {
    public static void main(String[] args) {

    }

    public static int[] sortArray(int[] array) {

        int[] oddArray = Arrays.stream(array)
                .filter(n -> n % 2 != 0)
                .sorted()
                .toArray();

        int j = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                array[i] = oddArray[j];
                j++;
            }
        }

        return array;
    }
}
