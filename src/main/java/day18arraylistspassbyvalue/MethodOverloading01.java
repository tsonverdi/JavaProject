package day18arraylistspassbyvalue;

public class MethodOverloading01 {


    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void add(int a,double b){
        System.out.println(a+b);
    }
    public static void add(double a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        add(3,5);//ilk method
        add(3,5.0);//3. method
        //add(3.0,4.0); Cast etmemiz lazim. iki tane ayni isi yapan method var.

        //Method Overloading nasil yapilir?
        /*
        1-Method isimleri ayni olsun
        2-Method parametreleri farkli olmali
            a-Parametre data tipleri degisir
            b-Paramaetre sayilari degisir
            c-Parametre yerleri degisir.Ancak data tipleri farkli ise.
         */

    }
}
