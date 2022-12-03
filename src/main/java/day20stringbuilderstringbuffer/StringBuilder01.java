package day20stringbuilderstringbuffer;

public class StringBuilder01 {
    /*
            1)"StringBuilder" Java'da bir Class'dir.
            2)"StringBuilder", String olusturmaya yarar.
            3)"String" Class varken nicin "StringBuilder" a ihtiyac duyariz?
               Cunku "String" Class "Immutable Class" dir, ama biz bazen "Mutable" String'lere ihtiyac duyariz,
               StringBuilder bize "Mutable" String verir.
            4) "Immutable Class" larda var olan deger degistirilemez. Siz var olan  bir degeri degistirmek istediginizde
                i)Memory'de yeni bir variable yeni degerle olusturulur
                ii)Eski variable'in pointer'i yeni variable'a dondurulur
                iii)Eger bir variable'i hicbir pointer gostermiyorsa o variable "Garbage Collector" tararfindan silinir
                "Mutable Class" larda var olan deger degistirilebilir. Oijinal deger korunmaz.
            5) "String Class" larin "immutable" yapisi "security" icin onemlidir.
            Ayni degere sahip birden fazla String oldugunda, Java bir tane container olusturur ve ayni deger sahip String'lerin bu container'i
            kullanmasini temin eder. Bu memeory'i korumak icin iyidir ancak container'daki degeri bir variable icin degistirdigimizde tum variable'larin
            etkilenmesi tehlikesi vardir. Bu tehlikeden kurtulmak icin Java, String'leri "immutable(degismez)" yapmistir. Fakat herhangi bir variablee'in
            degerini degistirmek icin Java bir yol bulmustur. Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in pointer'ini bu
            yeni variable'a yonlendirir. Boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur.

     */


    public static void main(String[] args) {

        String str = "Java";
        str = "Super Java";

        System.out.println(str);

        //StringBuilder nasil olusturulur?
        //1.Yol
        StringBuilder strb = new StringBuilder("Java");
        //2.Yol
        StringBuilder strb2 = new StringBuilder();
        //Yol a:
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2);
        //Yol b:
        strb2.append("Learn").append(" Java earn").append(" money. ");//Method Chain
        System.out.println(strb2);

        //String builderlarda char sayisini nasil bulunur.

        StringBuilder strb3 = new StringBuilder();
        strb3.append("cat");
        strb3.append("***************");

        int numOfChar = strb3.length();
        System.out.println(numOfChar);//3

        int capacity = strb3.capacity();
        System.out.println(capacity);//16

        //setcharat indexteki chari degistirir.
        strb3.setCharAt(2,'r');
        System.out.println(strb3);

        //delete
        strb3.delete(3,16);
        System.out.println(strb3);

        //deletecharAt
        strb3.deleteCharAt(4);
        System.out.println(strb3);

        //reverse
        strb3.reverse();
        System.out.println(strb3);

        String abc = "Java";
        abc.replace("a","i");

        //Stringe cevirme.
        String stringstrb3 = strb3.toString();
        System.out.println(stringstrb3);

        //Geri donusu yaptik.
        StringBuilder strb4 = new StringBuilder(stringstrb3);
        System.out.println(strb4);

        //Insert methodu
        strb4.insert(3,"XXXX");
        System.out.println(strb4);

        //2.Yol
        strb4.insert(3,"KLMOPQRSTU",5,8);
        System.out.println(strb4);

        StringBuilder a = new StringBuilder("java");
        StringBuilder b = new StringBuilder("Java");

        int sonuc = a.compareTo(b);//0
        System.out.println(sonuc);




    }
}
