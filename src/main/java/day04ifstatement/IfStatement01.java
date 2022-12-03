package day04ifstatement;

public class IfStatement01 {
    public static void main(String[] args) {


        //If it rains, I will cancel the picnic.
        //If statement belli kodlari belli sartlara bagli olarak calistirmaya yarar.

        //Example 1: Sayi pozitif ise ekrana positif yazdirin.
        int s = -1;
        if (s>0){
            System.out.println("Sayi pozitiftir.");
        }else {
            System.out.println("Sayi negatif veya 0");
        }

        //Example 2: Verilen karakter buyuk harf ise ekrana Buyuk Harf yazdirin. //ASCII table kullandik.
        char k = 'Z';
        if (k>='A'&& k<='Z'){
            System.out.println("Buyuk Harf");
        }
        //Example 3: Verilen bir sayinin uc basamakli ise ekrana uc basamakli yazdiriniz.
        int a = -100;
        a= Math.abs(a);
        if (a<=999 && a>=100){//n>99 && n<1000
            System.out.println("Uc basamakli bir sayidir.");
        }
        //Example 4 Verilen bir sayi ise ekrana cift sayi yazdiriniz.
        //"=" isareti atama operatorudur, matematik esittir anlamina gelmez.
        int b = -18;

        b = Math.abs(b);

        if (b%2==0){
            System.out.println("Cift sayidiir.");
        }else {
            System.out.println("Tek sayidir");
        }
        //Example 5: Verilen bir sayi 300 den kucuk veya 1200 den buyuk ise ekrana harika sayi yazdirin.

        int r = 299;

        if (r<300 || r>1200){
            System.out.println("Harika Sayi");
        }


    }
}
