package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

            /*Iki tane String'in birbirine esit olup olmadigini anlamak icin "==" degil, "equals()" kullaniniz.
            Iki tane String'in birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanilabilir
            i)equals() ==> Buyuk harf ve kucuk harfi onemser. "A" ile "a" farklidir.
            ii)equalsIgnoreCase() ==> Buyuk harf kucuk harfi onemsemez. "A" ile "a" aynidir.*/

        //Example 1: Kullanicidan gun isimlerini aliniz, o gunu hafta sonu mu hafta ici mi oldugunu kullaniciya soyleyiniz.


        Scanner input = new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz: ");
        String a = input.nextLine();

        //1.Yol
        if (a.equalsIgnoreCase("Pazar") || a.equalsIgnoreCase("Bazar")){
            System.out.println("Haftasonu");
        }else if (a.equalsIgnoreCase("Cumartesi")){
            System.out.println("Haftasonu");
        }else if (a.equalsIgnoreCase("Cuma")){
            System.out.println("Haftaici");
        }else if (a.equalsIgnoreCase("Persembe")){
            System.out.println("Haftaici");
        }else if (a.equalsIgnoreCase("Carsamba")){
            System.out.println("Haftaici");
        }else if (a.equalsIgnoreCase("Sali")){
            System.out.println("Haftaici");
        }else if (a.equalsIgnoreCase("Pazartesi")){
            System.out.println("Haftaici");
        }else {
            System.out.println("Boyle bir gun yoktur.");
        }
        //2.Yol
        if (a.equalsIgnoreCase("Pazar")|| a.equalsIgnoreCase("Cumartesi")){
            System.out.println("Haftasonu");
        }else if (a.equalsIgnoreCase("Cuma") ||
                a.equalsIgnoreCase("Persembe")||
                a.equalsIgnoreCase("Carsamba")||
                a.equalsIgnoreCase("Sali") ||
                a.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Haftaici");
        }else {
            System.out.println("Boyle bir gun yoktur.");
        }
        //3.Yol
        boolean haftaSonu = a.equalsIgnoreCase("Pazar")|| a.equalsIgnoreCase("Cumartesi");
        boolean haftaIci =  a.equalsIgnoreCase("Cuma") ||
                            a.equalsIgnoreCase("Persembe")||
                            a.equalsIgnoreCase("Carsamba")||
                            a.equalsIgnoreCase("Sali") ||
                            a.equalsIgnoreCase("Pazartesi");


        if (haftaSonu){
            System.out.println("Haftasonu");
        }else if (haftaIci) {
            System.out.println("Haftaici");
        }else {
            System.out.println("Boyle bir gun yoktur.");
        }

    }
}
