package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*Kullanicidan ilk orta ve soy ismini aliniz ve kimlik asagidaki formatta yazdiriniz
         */
        //1.Yol
        Scanner input = new Scanner(System.in);/*
        System.out.println("Lutfen isminizi giriniz: ");//next() kullanicidan String datasi almak icin kullanilir.
        String name = input.next();
        System.out.println("Lutfen orta isminizi giriniz: ");
        String middleName = input.next();
        System.out.println("Lutfen soy isminizi giriniz: ");
        String surName = input.next();
        System.out.println("Kimlik no giriniz: ");//Eger matematiksel islem yapilmayacaksa String alinabilir/
        String kimlikNo = input.next();
        System.out.println(name + " " + middleName + " " + surName + "\n" + kimlikNo);
        //2.Yol
        System.out.println("Tam isminizi giriniz...");
        String tamIsim = input.next();
        String tamOrta = input.next();
        String tamSon = input.next();
        String kimlikNo = input.next();

        System.out.println(tamIsim + " " + tamOrta + " " + tamSon + "\n" + kimlikNo);*/
        //3.Yol
        System.out.println("Ilk orta ve soy isminizi giriniz: ");
        String tamIsimdir = input.nextLine();
        String kimlikNom = input.nextLine();
        System.out.println(tamIsimdir);
    }
}
