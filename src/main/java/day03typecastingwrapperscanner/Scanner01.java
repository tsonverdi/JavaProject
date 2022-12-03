package day03typecastingwrapperscanner;


import java.util.Scanner;

public class Scanner01 {

    //Scanner kullanicidan data olmaya yarar. Scanner kullanici ile interaktif etkilesim saglar.
    //Scanner bir Java class`idir. Bu Class`i kullanabilmek icin onu import etmemiz gerekir.
    //Scanner Class`i util kutuphanesindedir.

    public static void main(String[] args) {

        //Kullanicidann data almak icin yapilmasi gerekenler
        Scanner input = new Scanner(System.in);
        //Kullaniciya ne yapacagini soyle
        System.out.println("Hey kullanici yasini gir: ");
        //Gelen sayiyi memoryde bir yere koyacagiz.
        byte sayi1 = input.nextByte();
        //Yazi gel
        System.out.println("Hey kullanici senin yasin: " + sayi1);


    }

}
