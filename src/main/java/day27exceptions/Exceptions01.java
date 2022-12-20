package day27exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        double r = kacKati("Java","xy");
        System.out.println(r);

        double r2 = kacKati(null,"xy");
        System.out.println(r2);

        double r3 = kacKati("Selenium","");
        System.out.println(r3);


    }

    //Verilen iki Stringden birinin karakter sayinin digerinin kac kati
    public static double kacKati(String str,String str2){
        double rs = 0;

        try{
            rs = str.length()/str2.length();
        }catch (NullPointerException e){
            System.out.println("Lenght methodu null ile kullanilamaz");
        }catch (ArithmeticException e){
            System.out.println("Herhangi bir sayi sifir ule bolunemez");
        }finally {
            System.out.println("Database ile connection kesildi");
        }
        return rs;

    }

    /*
        "final", "finally", "finalize" aciklayiniz.
        1)"final" bir keyword'dur. Variable, Class, ve Method'lar icin kullanilir.
              "final" keyword i)Variable'larda kullanilabilir.
                        public final int age = 12;
                        a)Atanan deger degistirilemez.
                        b)Deger atamasi yapilmak zorundadir.
                    ii)Method'larda kullanilabilir.
                       public final int add(){
                       return a+b;
                   }
                        a)Bir method olusturulurken "final" olarak olusturulmus ise
                          o methodun body'si asla degistirilemez. Dolayisiyla o method override edilemez.
                   iii)Class'larda kullanilabilir.
                       Bir Class'i "final" yaparsaniz o Class'i kisirlastirmis olursunuz
                       Bir Class "final" ise o Class'a extend edilemez.
                       "final" Class Child olabilir.
        2)"finally" bir "code block" dur.
          "try-catch" veya sadece "try" ile kullanilir.
          "finally" code block icine yazilan code'lar her halukarda calistirilir.
          Mesela Database ile connection'i kesmek herhalukarda yapilmasi gereken bir fiildir. Bunu "finally" ile yapabiliriz.
        3)"finalize" bir method'dur. Bu method Java tarafindan data'lar imha edilmeden once cagrilir, bu method data'lari
          imha edilecek hale getirir ve daha sonra "Garbage Collector" bu data'lari imha eder.
          "finalize" method'unu Java Developer'lar da cagirabilir ama Java kendi bildigini yapar.
     */
}
