package day18arraylistspassbyvalue;

public class Varargs01 {


    public static void main(String[] args) {
        //Kullanici diledigi kadar variable koyulabilir.
        /*
        1-Farkli sayilardaki parametrelerle calisabilen bir method olustrumak isterseniz varargs kullanmalisiniz
        2-Varargs arkada array kullanir. Bu yuzden arraylerle calisiyormus gibi davranabiliriz.
        3-Varargs olustrumak icin data type isim
        4-Varargs en sonda olma sarti ile fazla parametre kullanabiliriz.
        5-Bir Methotta birden fazla vargargs kullanilmaz.


         */
        int result1 = add(5,6);
        System.out.println(result1);
        int result2 = add(5,6,45);
        System.out.println(result2);


    }

    /*Iki sayinin toplamini retunr eden bir method
    public static int sum2 (int a,int b){

        return a+b;
    }
    //UC sayinin toplamini retunr eden bir method
    public static int sum3 (int a,int b,int c){

        return a+b+c;
    }
    //Dort sayinin toplamini retunr eden bir method
    public static int sum4 (int a,int b,int c,int d){

        return a+b+c+d;
    }
*/
    public static int add (int... a){
        int sum =0;
        for (int w: a
             ) {sum+=w;

        }
        return sum;
    }
}
