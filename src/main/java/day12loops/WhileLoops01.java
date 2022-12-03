package day12loops;

import java.util.Scanner;

public class WhileLoops01 {

    public static void main(String[] args) {
      //Example 1: 3ten 10a kdar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz
      //1.yol
        for (int i = 3; i<11;i++){
          System.out.print(i+ " ");
      }
        System.out.println();
      //2.yol
        int i =3;
        while (i<11){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        //Example 2: 17den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz

        int k = 17;
        while (k>3){
            if(k%2==0){
                System.out.print(k + " ");
            }
            k--;
        }
        System.out.println();
        //Example 3: 12 den 67 e kadar sayilarin toplamini veren kodu yaziniz
        int sum = 0;

        int m = 12;
        while (m<68){
            sum+=m;

            m++;
        }//Example 4: Soze verilen bir tamsayinin rakamlari toplamini ekrana yazdiran kodu yaziniz
        System.out.println(sum);
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = input.nextInt();

        int sum1 = 0;

        while (sayi>0){
            sum1+=sayi%10;
            sayi/=10;
        }
        System.out.println(sum1);
        //Example 5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
        System.out.println("Sayiyi giriniz...");
        int sayi2 = input.nextInt();
        int n = 1;
        while (n<10){
            System.out.println(sayi2 + "*" + n + " = " + sayi2*n );

            n++;
        }


    }

}
