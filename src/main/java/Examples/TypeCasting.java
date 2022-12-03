package Examples;

public class TypeCasting {

    public static void main(String[] args) {
        //Short data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.

        short ahmetHasta = 39;
        int newAhmetHasta = ahmetHasta;

        //Long data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.

        long ahmetHastaDegil = 36L;
        int newAhmetHastaDegil = (int) ahmetHastaDegil;

        //Double data tipinde bir değişken oluşturunuz ve onu bir float değişkenine dönüştürünüz.
        double tarikHasta = 36.5;
        float newTarikHasta = (float) tarikHasta;

        //Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
        // Sonrasında bu short değişkenin değerini konsolda yazdırınız.
        double sayi1 = 32.5;
        short newSayi1 = (short) sayi1;
        System.out.println(newSayi1);

        //Byte data tipinde bir değişken oluşturunuz ve onu bir double değişkenine dönüştürünüz.
        // Sonrasında bu double değişkenin değerini konsolda yazdırınız.
        byte hasta = 32;
        double newHasta = hasta;
        System.out.println(newHasta);




    }
}
