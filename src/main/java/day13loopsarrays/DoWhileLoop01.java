package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {
        //Example 1: 100den kucuk yazarsa kazandin desin 100den buyuk yazarsa kaybettin desin
        Scanner input = new Scanner(System.in);
        int a = 0;
        do {
            System.out.println("Lutfen bir sayi giriniz...");
            a = input.nextInt();
            if (a<100){
                System.out.println("kazandiniz");
            }
        }while (a<100);
            System.out.println("kaybettiniz");

         //Example 2: girilen bir isimin ilk harfi buyuk mu kontrol ederiz.

        //sart kismina true yazarsak sonsuz bir loop olur. kirmak icin de break koyariz.
        do {
            System.out.println("Lutfen isim giriniz...");
            char ilkHarf = input.next().charAt(0);

            if (ilkHarf>='A' && ilkHarf<='Z'){
                System.out.println("Basari ile girdiniz...");
            }else{
                System.out.println("Ismi yanlis girdiginiz icin isleminiz iptal edilmistir.");
                break;
            }
        }while (true);

        //Infinite Loop:Sonsuz Dongu
//        for (int i = 1; i<4; i--){
//            System.out.println("Hi");
//        }
//        for (int i = 1; i<4;){
//            System.out.println("Hi");
//        }
//        int i = 12;
//
//        while (i<15){
//            System.out.println("Hi!");
//        }

    }
}
