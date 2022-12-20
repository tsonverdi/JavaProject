package day26exceptions;

public class Exception02 {


    public static void main(String[] args) {

        String str = "Java";
        char c = getCharFromString(str,2);
        System.out.println(c);

        String str2 = "Selenium";
        char c1 = getCharFromString(str2,8);
        System.out.println(c1);

    }
    public static char getCharFromString (String a, int idx){
        char c = ' ';

        try {
           c= a.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){

            System.out.println("Index ile ilgili bir problem var" + e.getMessage());//e.getMessage() mesaji verir.

            e.printStackTrace();//Detayli log icin
        }
        return c;
    }
}
