package Examples;

import java.util.Scanner;

public class Scannera {
    public static void main(String[] args) {
        //Kullanicidan ad soyad memlket bilgilerini al
        /*Scanner input = new Scanner(System.in);
        System.out.println("Adinizi giriniz...");
        String isim = input.nextLine();
        System.out.println("Soyadinizi giriniz...");
        String soyisim = input.nextLine();
        System.out.println("Memleket giriniz...");
        String memleket = input.nextLine();
        System.out.println("Konum giriniz...");
        String konum = input.nextLine();
        System.out.println("Yasinizi giriniz...");
        String yas = input.nextLine();
        System.out.println("Boyunuzu giriniz...");
        String boy = input.nextLine();
        System.out.println("Javayi sevdiniz mi...");
        String javayi = input.nextLine();
        System.out.println("Kilonuzu giriniz...");
        String kilo = input.nextLine();

        System.out.println("Adiniz: " + isim);
        System.out.println("soyisim = " + soyisim);
        System.out.println("kilo = " + kilo);
        System.out.println(" = " + javayi);*/

        byte sayi1 = Byte.valueOf("103");
        short sayi2 = Short.valueOf("2351");

        System.out.println(sayi2-sayi1);
    }
}
