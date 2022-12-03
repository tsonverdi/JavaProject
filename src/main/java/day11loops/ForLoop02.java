package day11loops;

public class ForLoop02 {

    public static void main(String[] args) {
        //Example 1: Stringdeki m karakteri haric hepsini yazdiniriz
        //1. yol
        String str = "madam";

        for (int i = 0; i<str.length(); i++){
            char c = str.charAt(i);

            if (c!='m'){
                System.out.print(c);
            }
        }
        System.out.println();

        for (int i = 0; i<str.length(); i++){
            char c = str.charAt(i);

            if (c=='m'){
                continue;
            }else {
                System.out.print(c);
            }
        }
        System.out.println();
        //Example 2:1den 100e kadar 6 ile bolunenler haric tum sayilari ekrana yazdiriniz
        for (int i = 1; i<101; i++){
            if (i%6==0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        //Example 3: Size verilen bir Stringteki m den onceki karakterleri yazdiriniz.
        String s = "Luxemburg";

        for (int i = 0; i< s.length(); i++){
            char c = s.charAt(i);

            if (c=='m'){
                break;
            }
            System.out.print(c);
        }

    }
}
