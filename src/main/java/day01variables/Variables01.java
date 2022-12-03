package day01variables;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Variables01 {

                                //Variable nasil olusturulur?

    //1)Access modifier  2)Data Type  3)Variable ismi  4) =  5)Deger 6)noktali virgul
    //Java`da ";" Ingilizce`deki "." gibidir.
    //Ingilizce`de "cumle" deriz, Java`da "statement" deriz.
    //"=" assignment operator.

    public int age = 13;
    public int height = 183;

    /*                  Primitive Data Types
       1) Integer: int. Tam sayi demektir. 4 Byte
          Matematik`te tam sayilarin basi ve sonu yoktur.
          Fakat Java`da tam sayilarin sonu vardir.
          En kucuk int = -2,147,483,648
          En Buyuk int =  2,147,483,647
       2) Byte: Tam sayilar icin kullanilir. 1 Byte
                En kucuk byte = -128
                En buyuk byte = 127
       3) Short: Tam sayilar icin. 2 Byte
                 En kucuk: -32,768
                 En buyuk:  32,767
       4) Long: Tam sayilar icin. 8 Byte
                En kucuk: -9,223,372,036,854,775,808
                En buyuk:  9,223,372,036,854,775,807
       5) Float: Ondalikli sayilar icin. 4 Byte
                 "float" virgulden sonra 7 basamak icerebilir.
       6) Double: Ondalikli sayilar icindir. 8 Byte
                  "double" virgulden sonra 16 basamak icerebilir.
       7) boolean: true  veya false degerleri icin kullanilir. 1 bit kullanir.
       8) char: tek karakterler icin kullanilir. 2 byte
                A, c, 2, ?, _, =
        note: Numeric data types: byte< short < int < long < float < double
              Numeric olmayanlar: char ve boolean

                            Non-Primitive Data Types
     String: Isim,adres, kimlik numarası gibi bir veya birden fazla karakter içeren değerlerde kullanılabilir.
             String çift tırnak arasına konulmalıdır.
             Bir String oluşturunca java bize bir sürü method verir.

             Primitive ile Non-Primitivelerin farki nedir? interview sorusu?
             1)Non-primitive data tiplerinde degerin yanında methodlar vardır
             Primitive data tiplerinde ise sadece deger vardir. Method yoktur.
             2)Primitive data tipleri Java tarafindan olusturulmustur ve toplam 8 tanedir.Primitive
             data daha fazla olusturulumaz.
             Non-primitiveler ise Java tarafindan da olusturulmustur biz de olusturabiliriz. Her developer data tipi
             olsturabilir. Bir class bile  non-primitive data olusturulabilir.
             3)Primitive data type isimleri kucuk harflerle baslar.
             Non primitive data type isimleri buyuk harfle baslar.
             4)Primitive data typelar memoryde farkli buyuklukte yerler kullanir.
             Non-primitiveler hepsi memoryde ayni buyuklukte yer kullanirlar.

     */
     public byte price = 12;

     public short populationVillage = 23000;

     public float shirtPrice = 13.12f;

     public double weightOfCell = 0.993121231;

     //Siz "long" demenize ragmen Java verilen sayiyi "int" kabul eder.
     //Bu yuzden, long bir variable`a "int" araliginin disinda bir sayi verirseniz mutlaka sonuna "L" veya "l" koyunuz.
     public long populationOfWorld = 7000000000L;

     //Burada "L" koymadiginiz halde problem yok cunku "1234" int araligina uyar.
     public long x = 1234;

     public boolean isOld = true;
     public boolean isRich = false;

     public char initial = 's';

     public static String name = "Tom Hanks";

     //Note: main method calismadan hicbir sey calismaz.
     public static void main(String[] args) {


    }

}