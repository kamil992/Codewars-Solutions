package Codewars;

public class BrokenSequence {
    public static void main(String[] args) {
        BrokenSequence brokwenSequence = new BrokenSequence();

        System.out.println(brokwenSequence.findMissingNumber("1 2 3 5"));

    }

    public int findMissingNumber(String sequence) {
        if (sequence.isEmpty())
            return 0;

        for (int i = 1; i < sequence.split(" ").length + 1; i++) {
            String s = i + "";
            if (sequence.indexOf(s) == -1) {
                return i;
            }
        }

        return 0;
    }

    public int findMissingNumber2(String sequence) {
        String[] strNums = sequence.split(" ");
        int[] arrInts = new int[strNums.length];

        for(int i = 0; i < arrInts.length; i++){
            arrInts[i] = Integer.valueOf(strNums[i]);
        }
        int num = arrInts.length + 1;

        int lookinNum = (num * (num + 1)) / 2;
        for(int a : arrInts){
            lookinNum -= a;
        }
        return lookinNum;
    }


}
