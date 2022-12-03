package Examples;

import day02methodcreation.MethodCreation;

import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Scanner;

public class WrapperClasses {

    public static void main(String[] args) {
        //Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını
        //bulmak için bir kod yazınız.
        System.out.println(Byte.MIN_VALUE + Short.MAX_VALUE);

        //Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
        //yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
        //değişken arasındaki farkı yazdırınız.
        byte sayi1 = Byte.valueOf("103");
        short sayi2 = Short.valueOf("2351");
        System.out.println(sayi2-sayi1);

        //valueOf(String s) ile parseByte(String s) methodları arasındaki farklar nelerdir?
        System.out.println(Byte.parseByte("19"));

        //Type a program which calculates the area and the perimeter of a square
        //whose side length is entered by user.
        //Hint 1: Area of a square is length x length
        //Hint 2: Perimeter of a square is 4x length

        /*Scanner input = new Scanner(System.in);
        System.out.println("Lutfen karenin kenarini giriniz: ");
        double kareKenar = input.nextDouble();
        System.out.println("Karenin Alani: " + alan(kareKenar));
        System.out.println("Karenin Cevre: " + cevre(kareKenar));

        //Type a program which calculates the cube of a number which is entered
        //by user.
        //Hint 1: Cube of a number is a x a x a

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kupun bir kenarini giriniz: ");
        double kupunKenari = input.nextDouble();
        System.out.println("Kupun hacmi: " + kupunHacmi(kupunKenari));

        //Type a program which calculates the volume of a rectangular prism
        //whose length, width, and height are entered by user.
        //Hint 1: Volume of a rectangular prism is width x length x height

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen prismanin yuksekligini giriniz: ");
        double yukseklik = input.nextDouble();
        System.out.println("Lutfen prismanin bir taban kenarini giriniz: ");
        double taban1 = input.nextDouble();
        System.out.println("Lutfen prismanin diger taban kenarini giriniz: ");
        double taban2 = input.nextDouble();

        System.out.println("Ucgen prizmanin hacmi: " + MethodCreation.carpmaYap(yukseklik,taban1,taban2));


        //Type a program which calculates the area and the perimeter of a circle
        //whose radius is entered by user. (Use float)
        //Hint 1: Take pi number as 3.14159
        //Hint 2: Area of a circle is 3.14159 x radius x radius
        //Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
        //Hint 4: To get float, use nextFloat()

        Scanner input = new Scanner(System.in);
        System.out.println("Cemberin yaricapini giriniz: ");
        double yaricap = input.nextDouble();
        System.out.println("Cemberin alani: " + cemberinAlani(yaricap));
        System.out.println("Cemberin cevresi: " + cemberinCevresi(yaricap));

        //Type a program which converts the mile to kilometer. Mile value will be
        //entered by user. (Use double)
        //Hint 1: km = mile x 1.6
        //Hint 2: To get double, use nextDouble()

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen mesafeyi mile olarak giriniz: ");
        double mesafe = input.nextDouble();
        double kmMesafe = mesafe*1.6;
        System.out.println("Mesafenin km cinsinden yazilisi: " + kmMesafe);*/

        //Kullanıcıdan “ * ” gibi bir sembol alin
        //2) Ekrana asagidaki sekli yazdırın
        //Scanner input = new Scanner(System.in);
        //System.out.println("Bir ifade giriniz: ");
        //String sembol = input.nextLine();
        //System.out.println(" " + " " + sembol + " " + " " + "\n"+ " " + sembol +  " " + sembol + " " + "\n" + sembol + " " + sembol + " " + sembol);
        Scanner input = new Scanner(System.in);
        System.out.println("Isminizi ve Soyisminizi giriniz: ");
        String isimSoyisim = input.nextLine();
        System.out.println("Adresinizi giriniz: ");
        String adres = input.nextLine();

        System.out.println(isimSoyisim + "\n" + adres);







    }
    public static double alan (double a){
        double kareAlan = Math.pow(a,2);
        return kareAlan;
    }
    public static double cevre (double a) {
        double kareCevre = 4 * a;
        return kareCevre;
    }
    public static double kupunHacmi (double a){
        double hacim = Math.pow(a,3);
        return hacim;
    }
    public static double cemberinAlani (double a){
        double pi = 3.14159;
        double alan = Math.pow(a,2)*pi;
        return alan;
    }
    public static double cemberinCevresi (double a){
        double pi = 3.14159;
        double cevre = 2*a*pi;
        return cevre;
    }
}
