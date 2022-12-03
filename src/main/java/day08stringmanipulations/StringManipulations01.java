package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Example 1: Kullanicidan aldiginiz ismin ilk ve son harfini ekrana yazdiriniz

        Scanner input = new Scanner(System.in);
/*
        System.out.println("Lutfen isminizi giriniz: ");
        String isim = input.next();

        char ilkHarf = isim.charAt(0);
        char sonHarf = isim.charAt(isim.length()-1);//Yazdiginiz kod sadece bazi durumlar icin calisirsa hard coding denir.
        //
        System.out.println("ilk harf: " + ilkHarf + " son harf: " + sonHarf);

        //2.yol
        String  kombin = isim.substring(0,1) + isim.substring(isim.length()-1);
        System.out.println(kombin);

        //Example 2: Asagidaki String'deki tumhayvan isimlerini ekrana yazdiriniz
        //"Ben kedi esim tavuk oglum sever inek"

        String str = "Ben kedi esim tavuk oglum sever inek";

        String kombin1 = str.substring(4,8) + str.substring(14,19) + str.substring(32);
        System.out.println(kombin1);
*/
        //Example 3: Ilk isim ver soy isimi iceren isimlerden ilk ve soyisimlerin bas harflerini ekrana yazdiriniz
        //Ali Can ==>AC Tahsin Yurdakul ==>TY

        System.out.println("Isminizi ve soyisminizi giriniz: ");
        String tamIsim = input.nextLine();

        String firstLetter = tamIsim.substring(0,1);
        String firstLetter2 = tamIsim.split(" ")[1].substring(0,1);
        System.out.println(firstLetter + firstLetter2);

    }
}
