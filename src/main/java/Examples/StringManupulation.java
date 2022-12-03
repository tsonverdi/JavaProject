package Examples;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class StringManupulation {
    public static void main(String[] args) {
        /*//Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        //ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        //yazdırınız.
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sehir ismi giriniz");
        String city = input.next();
        String konsolSehir = city.trim().toLowerCase();
        konsolSehir = konsolSehir.toUpperCase().charAt(0) + konsolSehir.substring(1);


        System.out.println(konsolSehir);

        String isim1 = "Ali Can";
        String isim2 = "Merve Star";
        String isim3 = "Mark Tom";
        System.out.println(isim1.trim());
        System.out.println(isim2);
        isim1 = isim1.replaceAll(" ","");
        isim2 = isim2.replaceAll(" ","");
        isim3 = isim3.replaceAll(" ","");
        System.out.println((isim1+isim2+isim3).length());*/

        //Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
        //konsolda yazdırınız.

        String isimm = "Miami 33018!!!";
        String isimm1 = isimm.replaceAll(" ", "").replaceAll("[^A-Za-z-0-9]", "");
        System.out.println(isimm1.length());

        //Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
        //konsolda yazdırınız.

        String var1 = "1a3Bcf4!...";
        String var2 = var1.replaceAll(" ", "").replaceAll("[0-9]","");
        System.out.println(var2.length());

        //Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        //karakteri yazdırınız.

        String isim = "Tarik Sonverdi ";
        int bosluksuzIndex = isim.trim().length()-1;
        String bosluksuzIsim = isim.substring(bosluksuzIndex,bosluksuzIndex+1);
        System.out.println("Bosluk olmayan son karakter: " + bosluksuzIsim);

        //Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
        //toplamını bulunuz.
        String kadr = "Anne Cennet";
        char ilk = kadr.charAt(0);
        char son = kadr.charAt(kadr.length()-1);
        System.out.println("Ilk ve son ASCII degerleri toplam: " + (ilk+son));

        //Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda
        //yazdırınız.


    }
}
