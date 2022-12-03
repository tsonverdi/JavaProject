package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        //Kullanicidan islem ve iki tane tam sayi alarak sonucu ekrana yazdiran bir hesap makinesi yapiniz.
        //Switchte sadece int byte short char String data tipleri kullanilabilir.

        Scanner input = new Scanner(System.in);
        System.out.println("Islemi giriniz: +, -, *, /, %");
        char islem = input.next().charAt(0);

        System.out.println("Ilk syiyi girniz: ");
        int ilkSayi = input.nextInt();

        System.out.println("Ikinci sayiyi giriniz: ");
        int ikinciSayi = input.nextInt();

        switch (islem){
            case '+':
                System.out.println(ilkSayi+ikinciSayi);
                break;
            case '-':
                System.out.println(ilkSayi-ikinciSayi);
                break;
            case '*':
                System.out.println(ilkSayi*ikinciSayi);
                break;
            case '/':
                System.out.println(ilkSayi/ikinciSayi);
                break;
            case '%':
                System.out.println((ilkSayi*ikinciSayi)/100);
                break;
        }
    }
}
