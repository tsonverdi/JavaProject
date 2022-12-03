package day07ternarystringmanipulation;

public class NestedTernary01 {
    /*
        Verilen "Leap Year"(Artik) olup olmadigini kontrol eden kodu yaziniz.
        1-Yil 100 e bolunurse 400 e de bolunmelidir
        2-Yil 100 e bolunmez 4 e bolunmelidir.
     */
    public static void main(String[] args) {
        int year = 2000;

        String artikYil = year % 100 == 0 ? (year % 400 == 0 ? "leap year" : "leap year degil") : (year % 4 == 0 ? "leap year" : "leap year degildir");
        System.out.println(artikYil);

    /*
    Asagidaki kurallara gore passwordun gecerli olup olmadigini kontrol eden kodu yaziniz.
    i)Sekiz karakterden fazla karakter varsa ilk harfi 'i' olmalidir.
    ii)Sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir.
     */
        String pwd = "K2a3eda";
        int uzunluk = pwd.length();
        char ilkHarf = pwd.charAt(0);

        String pass = uzunluk<8 ? (ilkHarf=='K' ? "gecerli pass" : "gecersiz pass") : (ilkHarf=='i' ? "gecerli pass" : "gecersiz pass");
        System.out.println(pass);

    }
}
