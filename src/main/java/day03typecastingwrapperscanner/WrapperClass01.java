package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*Java primitivelere methodlar ekleyerek yeni bir structure
        olusturdu. Bu yapiya "Wrapper Class" denir.

                byte ==> Byte(Wrapper Class)
                 Primitive           Wrapper
                    byte            Byte
                    short           Short
                    int             Integer
                    long            Long
                    float           Float
                    double          Double
                    boolean         Boolean
                    char            Character
           -Wrapper Classlar non-primitivedir.
           -Wrapper Classlar Class`tir. Zaten ilk harflerinin buyuk olmasindan belli.
         */

        byte primitiveByte =12;//nokta koyunca method gelmez cunku primitive method icermez sadece deger icerir.
        Byte wrapperByte = 12;//nokta koyunca direkt methodlar geliyorlar.

        //EX1: Byte data type`inin en kucuk ve en buyuk degerlerini ekrana yazdiriniz.
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        //EX2: short, int, long data typelerin en buyuk ve en kucuk degerlerini ekrana yazdiriniz.
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        //"primitive"ler nasil "wrapper"lara cevrilir.
        float f1 = 13.99F;
        Float wrapperF1 = f1;

        //wrapperler nasil primitivelere cevrilir.
        Character w1 = 'A';
        char primitiveW1 = w1;
        System.out.println(w1.charValue());

        //Biz olusturdugumuz variablelarda olusturdugumuz methodlari kullanmak istersek onu Wrapper yapariz.
    }
}
