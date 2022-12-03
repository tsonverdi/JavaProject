package day04ifstatement;

import java.util.Scanner;

        /* Char variablelari matematiksel islemlerde kullanirsak Java onlarin ASCII
        degerlerini kullanir. Ornegin, System.out.println(`A` + `C`) ekrana AC yerine 132 yazdirir.

        Javada + sembolunun iki anlami vardir. 1. anlam toplama islemidir. 2. anlam ise birlestirme islemidir(Concatenation).
        Java + sembol gorunce once toplama yapmaya calisir, yapamaz ise birlestirme islemi yapmaya calisir o da olmaz ise
        hata verir.
         */

public class Scanner02 {
    public static void main(String[] args) {
        //Kullanicidan ilk ve soyisimini aliniz, ilk ve soyisiminin ilk harflerini ekrana yazdiriniz.

        Scanner input = new Scanner(System.in);/*
        System.out.println("Lutfen isminizi giriniz...");
        char name = input.next().charAt(0);
        System.out.println("Lutfen soyisiminizi giriniz...");
        char surname = input.next().charAt(0);

        System.out.println("" + name + surname);*/

        //2.Yol
        System.out.println("Tam isminizi giriniz...");
        String tamIsim = input.nextLine();
        char ilkHarf = tamIsim.charAt(0);
        System.out.println(ilkHarf);
        System.out.println(tamIsim.split(" ")[2].charAt(0));
        //

    }
}
