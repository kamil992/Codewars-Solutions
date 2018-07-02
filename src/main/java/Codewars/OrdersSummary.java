package Codewars;

public class OrdersSummary {
    public static void main(String[] args) {
        String l = "ZNGA 1300 2.66 B, CLH15.NYM 50 56.32 B, OWW 1000 11.623 B, OGG 20 580.1 B";
        String[] products = l.split(", ");

        for (String s : products)
            System.out.println(s);
        int bSum = 0;
        int sSum = 0;
        String[] orderParts = new String[4];
        for (int i = 0; i < products.length; i++) {
            orderParts = products[i].split(" ");

            if (orderParts[3].equals("B"))
                bSum += (Double.parseDouble(orderParts[1]) * Double.parseDouble(orderParts[2]));

            if (orderParts[3].equals("S"))
                sSum += (Double.parseDouble(orderParts[1]) * Double.parseDouble(orderParts[2]));
        }

        System.out.println(bSum);
        System.out.println(sSum);

        System.out.println(balanceStatements(l));
    }

    public static String balanceStatements(String lst) {
        String[] products = lst.split(", ");
        String[] orderParts = new String[4];
        int bSum = 0;
        int sSum = 0;
        int badCount = 0;
        String badResult = "";
        String badProduct = "";
        for (int i = 0; i < products.length; i++) {
            orderParts = products[i].split(" ");

            if (correctOrNot(products[i])) {
                badProduct += products[i] + " ;";
                continue;
            }


            if (orderParts[3].equals("B"))
                bSum += (Double.parseDouble(orderParts[1]) * Double.parseDouble(orderParts[2]));

            if (orderParts[3].equals("S"))
                sSum += (Double.parseDouble(orderParts[1]) * Double.parseDouble(orderParts[2]));

            badResult = "Buy: " + bSum + " Sell: " + sSum + "; Badly formed "
                    + badCount + ": " + badProduct;

        }

        if (!badProduct.equals(""))
            return badResult;


        return "Buy: " + bSum + " Sell: " + sSum;

    }

    public static boolean correctOrNot(String str) {
        String[] arr = str.split(" ");

        if (arr.length == 4) {
            if (arr[3].equals("B") || arr[3].equals("S")) {
                if (arr[2].contains("."))
                    return false;
            }
        }
        return true;
    }
}
