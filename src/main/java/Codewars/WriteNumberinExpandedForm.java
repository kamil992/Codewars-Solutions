package Codewars;

public class WriteNumberinExpandedForm {
    public static void main(String[] args) {
        System.out.println(expandedForm(755505));
    }

    public static String expandedForm(int num) {
        String numAsStr = String.valueOf(num);
        String strNum = "";
        StringBuilder stringBuilder = new StringBuilder(strNum);
        for (int i = 0; i < numAsStr.length(); i++) {
            if (!numAsStr.substring(i, i + 1).equals("0")) {
                strNum = numAsStr.substring(i, i + 1);
                for (int j = i; j < numAsStr.length() - 1; j++) {
                    strNum = strNum.concat("0");
                }
                stringBuilder.append(strNum + " + ");
            }
        }

        return stringBuilder.delete(stringBuilder.length() - 3, stringBuilder.length()).toString();
    }
}
