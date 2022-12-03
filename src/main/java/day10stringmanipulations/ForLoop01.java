package day10stringmanipulations;

public class ForLoop01 {

    public static void main(String[] args) {
        //Ekrana 5 kere "Hi" yazdiriniz.
        String m = "Hi ";
        System.out.println(m.repeat(5));

        //Tekrarli isler icin Loop kullaniriz.
        //Dort cesit loop vardir. For Loop, While Loop, Do While Loop, For Each Loop


        //For Loop
        //Example 2: Ekrana 5 kere "Hi" yazdiriniz.

        for (int i = 1 ; i<6  ;i=i+1 ){
            System.out.println("Hi");
        }

        //Example 3: 4ten 7e kadar tamsayilari ekrana yazdiran kodu yaziniz.
        for (int i=4; i<8; i++ ){
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 4: 14ten 5 e kadar tum tam sayilari yazdirina kodu yaziniz
        for (int i = 14; i>4; i--){
            System.out.print(i+ " ");
        }
        System.out.println();
        //Example 5: 14ten 5 e kadar tum cift sayilari yazdiriniz
        //1.yol
        for (int i = 14; i>4; i-=2){
            System.out.print(i+" ");
        }
        System.out.println();
        //2.yol
        for (int i =14; i>4; i--){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //Example 6: 28den 157ye kadar tum tek sayilari ekrana yazidran kodu ekrana yazdiriniz
        for (int i =28; i<158; i++){
            if (i%2==1){
                System.out.print(i+" ");
            }
        }
        //Example 7:"Java" Stringini "J*a*v*a*" String inie ceviren kodu yaziniz.
        System.out.println();
        String str ="Java";
        for (int i = 0; i<str.length(); i++ ){
            System.out.print(str.charAt(i) + "*");
        }
        System.out.println();
        //Example 8: Size verilenn Stringde tekrarsiz karakterleri ekrana yazdiriniz
        //Space de tekrarsizdir ondan yazdirir.
        String s = "Hellooo Ali";
        for (int i =0; i<s.length();i++ ){
            char c = s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(s.charAt(i) + " ");
            }

        }
    }

}
