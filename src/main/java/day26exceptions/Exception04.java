package day26exceptions;

public class Exception04 {

    //Yasi ekrana yazdiran bir method olusturunuz

    public static void main(String[] args) {
       int age = 250;

        try {
            printAge(age);
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }

    public static void printAge(int a){
        if(a<0 || a>200){
            throw new IllegalArgumentException("Yas negatif olamaz veya 200den buyuk olamaz");
        }
        System.out.println("Yasiniz : " + a);
    }
}
