package day18arraylistspassbyvalue;

public class PassByValue01 {

    public static void change (int a){

        System.out.println(a*3);
    }

    public static int indirim (int gomlekUcreti){

        return gomlekUcreti -10;
    }

    public static void main(String[] args) {

        int x =5;//Gomlek
        System.out.println(x);
        change(x);//Ogrenci Gomlegi
        System.out.println(x);//Orijinal Gomlek degeri
        int ucret = 100;//Ucret
        ucret = indirim(ucret);//Degismis cunku atadik
        System.out.println(ucret);//Degismis

    }
}
