package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type Casting: Bir numeric data type`ini diger numeric daya type`ina cevirmek demektir.
    //          byte<short<int<long<float<double

    //Note:Kucuk data type buyuge cevirmeye "Auto Widening" denir.
    //Note:Buyuk data type kucuge cevirmeye "Explicit Narrowing" denir.
    public static void main(String[] args) {

        byte age = 23;

        int newAge = age;

        long population = 1234;

        int newPopulation = (int) population;
        System.out.println(newAge);

        //Shortu double a ceviren kodu yaziniz.
        short adam = 233;
        double newAdam = adam;

        //Float byte yapan kodu yaziniz.
        float kar = 98.1F;
        byte newKar = (byte) kar;
        System.out.println(newKar);
        //Tam sayiya cevirirken yuvarlama islemi yapmaz.
        //Java ondalikli sayiyi tam sayiya cevirirken ondalik kismini siler.

        int number = 515;
        byte newNumber = (byte) number;
        System.out.println(newNumber);//3


        int num = 510;
        byte newNum = (byte) num;//-2
        //Moduler aritmetik yapar. 254 = -2(mod 256)

    }


}
