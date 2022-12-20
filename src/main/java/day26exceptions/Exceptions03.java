package day26exceptions;

public class Exceptions03 {


    public static void main(String[] args) {

        double r = mixIslemler("");
        System.out.println(r);

    }

    public static double mixIslemler (String a){
            int length = 0;
            int str = 0;
            double sonuc = 0;
        try {
            length = a.length();//NullPointerException

            str = Integer.valueOf(a);//NumberFormat

            sonuc =  str / length;//ArithmeticException
        }catch (NullPointerException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        return sonuc;
    }
    public static double mixIslemlerCharacter (String a){
        int length = 0;
        int str = 0;
        double sonuc = 0;
        try {
            length = a.length();//NullPointerException

            str = Integer.valueOf(a);//NumberFormat

            sonuc =  str / length;//ArithmeticException
        }catch (Exception e){
            e.printStackTrace();
        }
        return sonuc;

    }

    public static double mixIslemlerCharacters (String a){
        int length = 0;
        int str = 0;
        double sonuc = 0;
        try {
            length = a.length();//NullPointerException
            str = Integer.valueOf(a);//NumberFormat
            sonuc = str / length;//ArithmeticException
        }catch (NullPointerException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return sonuc;
    }
}
