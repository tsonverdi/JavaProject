package day07ternarystringmanipulation;

public class StringManupilations01 {

    //String Class Methodlari
    /*
        1)equals : -Iki tane String ayni mi degil mi
                   -boolean return eder
        2)equalsIgnoreCase : -Iki string ayni mi degil mi buyuk harfe kucuk harfe dikkat etmeden
                             -boolean
        3)toLowerCase : -harfleri kucuk harfe cevirmek icin
                        -String return eder
        4)toUpperCase : -hepsini buyuk harfe cevirir.
                        -String return eder
        5)charAt : -Bir stringden belli indexteki characteri almak icin
                   -char return eder
        6)lenght : -stringin kac karakteri var
                   -int return eder
        7)contains : -bir stringde belli bir veya daha fazla character var mi yok mu
                     -boolean
        8)split : -Parcalamaya yarar. kullanilan char olur
                  -Array return eder
     */

    public static void main(String[] args) {
        /*
            Bir pass gecerli olup olmadigini kurallara gore kontrol eden kodu yaziniz.
            1 En az 8 karakter
            2 space icermesin
            3 ilk harf M veya m olsun
            4 son karakter ? olsun
         */
        String pwa = "Manisa?";

        boolean first = pwa.length()>7;
        boolean second = !pwa.contains(" ");
        boolean third = pwa.charAt(0)=='M' || pwa.charAt(0)=='m';
        boolean fourth = pwa.charAt(pwa.length()-1)=='?';
        System.out.println(first && second && third&& fourth);
    }
}
