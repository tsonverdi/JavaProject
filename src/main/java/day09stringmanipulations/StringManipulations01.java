package day09stringmanipulations;

import java.sql.Struct;
import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        String str = "Kara kara dusunme Ankara";

        //indexOf methodu verilen char veya charlarin ilk gorunumunun indexini veriri.
        int idxA = str.indexOf("kara");
        System.out.println(idxA);

        int lastidxA = str.lastIndexOf("a");
        System.out.println(lastidxA);
        //Indexof hem String hem de char ile kullanilarbilir
        String str1 = "Mississisppi";

        System.out.println(str1.indexOf("i")); //ilk char indexi

        System.out.println(str1.lastIndexOf("i"));

        System.out.println(str1.lastIndexOf("is"));


        //Example 1: Stringdeki bir char in tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz.
        //"Helloooo"
        String str2 = "Helloooo";

        char c ='H';

        if(str2.indexOf(c)==str2.lastIndexOf(c)){
            System.out.println("Tekrarsiz");
        }else {
            System.out.println("Tekrarli");
        }

        String u = "Learn Java earn money";

        int sonuc = u.indexOf("a",3);
        System.out.println(sonuc);
        System.out.println(u.lastIndexOf("a",5));

        String m = "Hello everyone!";

        int e =  m.lastIndexOf("e",10);
        System.out.println(e);

        String v = "";
        //isEmpty bos olup olmagini kontrol eder
        //Eger hic char yoksa true return eder.
        //lenght==0 da Stringin bos olup olmadigini kontrol eder.
        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);

        //Example 2: Kullanicidan alinan isim mutlaka spaceten farkli en az 1 char icermelidir.
        Scanner input = new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim = input.nextLine();

        if(isim.isBlank()){
            System.out.println("Sana ismini gir dedim");

        }else {
            System.out.println(isim);
        }
    }
}
