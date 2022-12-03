package day12loops;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        int i = 1;

        while (i<1){
            System.out.println("While Loop");
            i++;
        }

        int k = 1;
        do {
            System.out.println("do-while loop");
            k++;
        }while (k<1);

        //Example 1: Bir ondalik sayinin ondalik kismindaki rakamlari toplamini bulunuz
        double a = 24.5673;

        String str = String.valueOf(a);
        System.out.println(str);
        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);
        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);

        int sum = 0;
        do {
            sum+=decimalInt%10;

            decimalInt/=10;

        }while (decimalInt>0);
        System.out.println(sum);

    }
}
