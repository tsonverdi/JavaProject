package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin en ve boyunu alip alan ve cevresini hesaplayan kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Kisa kenari giriniz...");
        double kisaKenar = input.nextDouble();
        System.out.println("Uzun kenari giriniz...");
        double uzunKenar = input.nextDouble();
        System.out.println("Alani: " + alan(kisaKenar,uzunKenar));
        System.out.println("Cevre: " + cevre(kisaKenar,uzunKenar));
    }
    public static double alan (double a,double b){

        double dikAlani = a * b;

        return dikAlani;
    }
    public static double cevre(double a, double b){

         double dikCevre = (a+b)*2;

        return dikCevre;
    }
}
