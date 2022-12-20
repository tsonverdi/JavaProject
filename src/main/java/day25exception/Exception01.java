package day25exception;

public class Exception01 {

    public static void main(String[] args) {
        divide(6,2);
        divide(0,2);
        divide(2,0);

        divide2(4,0);
        divide2(12,2);
    }
    //1.Yol
    public static void divide(int a,int b){
        if (b==0){
            System.out.println("Sifir ile bolunemez");
        }else {
            System.out.println(a / b);
        }

    }
    //2.Try Catch kullanaral exception handle etmek tavsiye edilir
    public static void divide2(int a,int b){

        try {
            System.out.println(a / b);
            System.out.println("bye exception");
        }catch (ArithmeticException e){
            System.out.println("Bolme isleminde bir problem olustu"+ e.getMessage());
            e.printStackTrace();
            System.err.println("Bolme isleminde bir problem olustu");
        }
        //java matematik ile ilgili karsılasılması muhtemel tum istisnalari, hatalari ArithmeticException class'ina koymustur.
        //Matematikteki tüm istisnalari detaylari bilmek zorunda degiliz

    }
}
