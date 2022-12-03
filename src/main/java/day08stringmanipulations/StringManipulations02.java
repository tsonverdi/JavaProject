package day08stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        //Example 1 :Bir Stringdeki space harci kac tane char kullanilidigini gosteren kodu yaziniz

        //"Ali okula gitti."

        String str = "Ali okula gitti.";
        //replace methodu bir stringteki her hangi bir karakteri veya karakterleri degistirmek icin kullanilir.
        int num = str.replace(" ", "").length();

        System.out.println(num);

        //Example 2: Bir stringteki tum a harflerini buyuk A ya ceviriniz.
        String s = "Ankara'nin tasina gozlerimin yasina bak.";

        String newS = s.replace('a', 'A');
        System.out.println(newS);

        //Example 3: Bir stringteki kara keilmesinin yerine * koyunuz.
        String t = "Kara kara dusunme Ankara";
        String newT = t.replace("kara", "*");
        System.out.println(newT);

        //Example 4: Bir Stringteki tum sayilari * ceviriniz.
        String m = "TS2013302108";
        String newM = m.replaceAll("[0-9]", "*");
        System.out.println(newM);

        //Example 5: bir stringte kullanilan noktalama isareti ve rakamlar ve space karakteri haric tum karakterlerin sayisini bulan
        //kodu yaziniz
        String u = "Ali 13 yasinda, dersem inanma!...";
        int sonuc = u.
                        replaceAll("[0-9]","").
                        replaceAll(" ", "").
                        replaceAll("\\p{Punct}", "").
                        length();
        System.out.println(sonuc);

        //Example 6: Bir passwordun gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //Sapce haric en az 8 karakter
        //en az bir sembol
        //en az bir rakam
        //en az 1 buyuk
        //en az 1 kucuk harf

        String pwd = "B&*CK!m";
        boolean first = pwd.replace(" ", "").length()>7;
        boolean second = pwd.replaceAll("[0-9a-zA-Z]", "").length()>0;
        boolean third = pwd.replaceAll("[a-zA-Z]","").replaceAll("\\p{Punct}","").length()>0;
        boolean third2 = pwd.replaceAll("[^0-9]","").length()>0;
        boolean fourth = pwd.replaceAll("[0-9a-z]","").replaceAll("\\p{Punct}","").length()>0;
        boolean fourth2 = pwd.replaceAll("[^A-Z]","").length()>0;
        boolean fifth = pwd.replaceAll("[^a-z]","").length()>0;

       boolean passed =  first && second && third2 && fourth2 && fifth;
         String passedd = passed ? "Gecerli" : "Gecersiz";
        System.out.println(passedd);

        //Example 7 : bir Stringdeki noktalama isaretleri haric karakter sayisini gosteren kodu yaziniz.
        String cumle = "Sen yapmazsan, ben yapmazsam, o yapmazsa kim yapacak?...";
        int num2 = cumle.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(num2);

        //Example 8: Bir String "Al" ile basliyor ve x ile bitiyorsa ekrana Harika yazdirin aksi halde Normal yazdirin

        String v = "Alex";
        boolean start = v.startsWith("Al");
        boolean end  = v.endsWith("x");

        boolean chance = start && end;

        String result =  chance ? "Harika" : "Normal";
        System.out.println(result);

    }
}
