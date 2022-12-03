package day11loops;

public class ForLoop01 {

    public static void main(String[] args) {
        //Example 1: 3'ten 6 a kadar tamsayilarin toplamini bulan kodu bulunuz
        int sum = 0;

        for (int i = 3; i<7; i++){
            sum+=i;
        }
        System.out.println(sum);
        //Example 2: 6dan 3 e kadar tamsayilarin carpimini bulan kodu yaziniz
        int sum1 = 1;

        for (int i = 6; i>2; i--){
            sum1*=i;
        }
        System.out.println(sum1);
        //Example 3: Size verilen bir tamsayinin rakamlari toplamini bulunuz.
        int a = 345;

        int sum2 = 0;

        for (int i = a; i>0;i=i/10 ){
            sum2=sum2 + i%10;
        }
        System.out.println(sum2);
        //Example 4: Size verilen bir Stringi ters ceviren kodu yaziniz
        String m = "Kaba";
        //Concat yaparken bos String kullancagiz.
        String newM = "";
        for (int i = m.length()-1; i>-1; i--){
            char c =m.charAt(i);
            newM+=c;
        }
        System.out.println(newM);
    }
}
