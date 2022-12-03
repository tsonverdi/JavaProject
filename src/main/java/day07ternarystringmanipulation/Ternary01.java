package day07ternarystringmanipulation;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {
        //Example 1: Bir sayinin pozitif mi negatif mi oldugunu ekrana yazdiran kodu yaziniz.

        //if-else
        int a = 0;
        if(a>0){
            System.out.println("Pozitif");
        }else{
            System.out.println("Pozitif degil");
        }
        //2. Yol:

        String sonuc = a>0 ? "Pozitif" : "Pozitif degil";
        System.out.println(sonuc);

        //Example 2:Iki sayidan kucuk olani secen kodu yaziniz.
        int b= 23;
        int c= 23;

        int kucuk = b<c ? b : c;
        System.out.println(kucuk);

        //Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz

        int d = -45 ;
        int mutlakDeger = d<0 ? d*-1 : d;
        System.out.println(mutlakDeger);

        //Example 4: Iki tane sayi ayni isaretli ise bu sayilari carpiniz, farkli isaretli ise "Islem yapamam" mesaji veriniz

        int e= -12;
        int f= 10;
        //Ternary farkli data tiplerinde sonuc return ederse sonucun data tipini "object yapiniz.
        Object yaz = (e>0 && f>0) || (e<0 && f<0) ? e*f : "Islem yapamam";
        System.out.println(yaz);
    }
}
