package Examples;

import java.util.Scanner;

public class Examples {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        //1-Herhangi bir 3 öğenin fiyatları için double data tipinde değişkenler oluşturunuz. Fiyatlarıtoplamını konsola yazdırınız.
        double shirt1 = 23;
        double shirt2 = 12;
        double shirt3 = 57;

        System.out.println("Price of all shirts: " + (shirt1 + shirt2 + shirt3));

        //2-Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu değişkenlerin değerlerinin çarpımını konsolda yazdırınız.
        float weight1 = 45.4F;
        long weight2 = 3445L;
        int weight3 = 46;

        System.out.println("Multiplication of Variables: " + (weight1*weight2*weight3));

        //3-Basit faizi bulmak için bir kod yazınız.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen anaparayi giriniz: ");
        int anapara = scan.nextInt();
        System.out.println("Lutfen faiz oranini giriniz: ");
        double oran = scan.nextDouble();
        System.out.println("Lutfen vade yilini giriniz: (gun hesabi yapmak icin yili 0 giriniz)");
        int yil = scan.nextInt();


        switch(yil) {

            case 0:
                System.out.println("Lutfen vade gununu giriniz: ");
                int gun = scan.nextInt();
                System.out.println(gun + " gunde getirecegi faiz orani: " + (anapara * oran * gun / 36500)
                + " tl");
            break;

            default:
            System.out.println(yil + " yilda getirecegi faiz orani: " + (anapara * oran * yil / 100) + " tl");
        }

       //4-Bir String ve iki long data tipinde değişken oluşturunuz. Konsolda bu long değişkenlerin toplamını ve çarpımını String ile yazdırınız.

        String name = "Sonuc";

        long number1 = 34L;
        long number2 = 45L;

        System.out.println("Carpim" + " " + name + " " + (number1*number2) + " " + "Toplam" + " "+ name + " "+ (number1+number2));

        //İki tamsayıyı değiştirmek için bir kod yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz: ");
        int integer1 = scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz: ");
        int integer2 = scan.nextInt();

        System.out.println("Replacing integers: " + integer1 + " - " + integer2);

        int bos = integer1;
        integer1 = integer2;
        integer2 = bos;
        System.out.println("Replaced integers: " + integer1 + " - " + integer2);

        //Write a Java program that takes two numbers as input and display the product of two numbers.
        System.out.println("Lutfen ilk sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz: ");
        int sayi2 = scan.nextInt();
        System.out.println("Sayilarin carpimi: " + carpimMethod(sayi1,sayi2));


        //Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        System.out.println("Lutfen ilk sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz: ");
        int sayi2 = scan.nextInt();
        System.out.println("Sayilarin carpimi: " + carpimMethod(sayi1,sayi2));
        System.out.println("Sayilarin toplami: " + toplamMethod(sayi1,sayi2));
        System.out.println("Sayilarin farki: " + cikarmaMethod(sayi1,sayi2));
        System.out.println("Sayilarin bolumu: " + bolmeMethod(sayi1,sayi2));
        System.out.println("Sayilarin remainderi: " + modulusMethod(sayi1,sayi2));



        //Write a Java program that takes a number as input and prints its multiplication table upto 10.
        System.out.println("Lutfen sayiyi giriniz: ");
        int int1 = scan.nextInt();
        for (i=1; i<=10; i++){
            //System.out.println(int1 + "`in " + i + " ile carpimi: " +  (int1*i));
            System.out.println(int1 + " x " + i + " = " + (int1*i));
        }


        //Write a Java program to print the area and perimeter of a circle.
        System.out.println("Lutfen cemberin yaricapini giriniz: ");
        double yaricap = scan.nextDouble();
        double pi = 3;
        double cevre = pi*yaricap*2;
        double alan = Math.pow(yaricap,2)*pi;
        System.out.println("Cemberin cevresi: " + cevre + "\n" + "Cemberin alani: " + alan);


        //Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
        System.out.println("Lutfen uc sayi giriniz giriniz: ");
        double say1 = scan.nextDouble();
        double say2 = scan.nextDouble();
        double say3 = scan.nextDouble();
        //System.out.println(ortalamaMethod(say1,say2,say3));


        double top=0;
        double ort=0;
        int i = 1;
        while (i < 6) {
            System.out.println(i + ". sayiyi giriniz: ");
            double b = scan.nextDouble();
            top+= b;
            ort = top / i;
            i++;
            System.out.println("ortalama: " + ort);
        }



        for (i=1; i<=5; i++){
            System.out.println(i + ". sayiyi giriniz: ");
            double b = scan.nextDouble();
            top+=b;
            ort= top/i;
            System.out.println("ortalama: " + ort);
        }

        // Write a Java program to convert a decimal number to binary number.?
        System.out.println("Sayiyi giriniz: ");
        int b = scan.nextInt();
        int i = 0;
        int j = b/2;
        while (i<j){
            int a = b%2;
            System.out.print(a);
            b/=2;
            i++;
        }


        String txt = "Hello";
        System.out.println(txt.indexOf("e"));
        //System.out.println(Math.);

        //Given a number n, write a method that sums all multiples of three and five up to n (inclusive).

        System.out.println(sum(3));
    }

    public static Integer sum(Integer n) {
        Integer sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;

         */


    }
    public static double ortalamaMethod(double a, double b, double c) {
        return (a+b+c)/3;
    }
    public static int carpimMethod(int a, int b) {
        return a*b;
    }
    public static int toplamMethod(int a, int b) {
        return a + b;
    }
    public static int cikarmaMethod(int a, int b) {
        return a - b;
    }
    public static int bolmeMethod(int a, int b) {
        return a / b;
    }
    public static int modulusMethod(int a, int b){
        return a%b;
    }
}
