package day25exception;

public class Exception03 {

    public static void main(String[] args) {
        String b = null;
        karakterSayisi(b);//Null
    }
    //Bir String te bulnan karakterlerin sayisini bulabilmek icin bir method olusturunuz
    public static void karakterSayisi (String a){
        int karakterSayisia = a.length();
        try {
            System.out.println("karakterSayisi = " + karakterSayisia);
        }catch (NullPointerException e){
            System.out.println("length() methodunda bir problem olustu ");

            e.printStackTrace();
            //bu methodu kullandiginiz zaman System.out.println(); kullanmaniza gerek yok
        }

    }
}