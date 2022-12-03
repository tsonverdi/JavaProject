package day02methodcreation;

public class MethodCreation {

    //Main method icinde kullanacaginiz her sey static olmalidir.

    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2,5));
        System.out.println("Uc sayinin carpimi: " + carpmaYap(2.5,4,6));
        System.out.println("Ilk iki sayinin toplami ile ucuncu sayinin carpimi: " + toplaVeCarp(5,6,2));
        //Ekrana bir sey yazdirmak icin iki tane kod var. 1)System.out.println() 2)System.out.print()

    }
    //Uc sayidan ilk iksiini toplayip ucuncu ile carpan method olusturup sonucu ekrana yazdirin
    public static double toplaVeCarp (double a, double b, double c){
        return (a+b)*c;
    }

    //Toplama islemi yapan bir method olusturunuz.

    public static double toplamaYap(double a, double b){
        return a+b;
    }

    //Uc sayiyi birbiri ile carpan bir method olusturunuz
    public static double carpmaYap (double a, double b, double c){

        return a*b*c;
    }


}
