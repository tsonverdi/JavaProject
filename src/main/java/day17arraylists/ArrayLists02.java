package day17arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists02 {
    public static void main(String[] args) {
        //Example 1:Verilen bir listteki elemanlari tekrarsiz olarak yaziniz.

        List <Integer> eleman = new ArrayList<>();
        eleman.add(1);
        eleman.add(1);
        eleman.add(2);
        eleman.add(4);
        eleman.add(4);
        eleman.add(6);
        List<Integer> neleman = new ArrayList<>();

        for (Integer w: eleman
             ) {if (!neleman.contains(w)){
                 neleman.add(w);
        }

        }
        System.out.println(neleman);

        //Example 2:Kullanicidan bir harf aliniz harf sizdeki List"in icerisinde varsa o harfi Bulunduya cevirin eger yoksa ekleyin
        Scanner input = new Scanner(System.in);
        String a = "";
        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("B");
        c.add("K");
        c.add("F");
        do {


        System.out.println("Bir harf giriniz");
        a = input.next().substring(0,1);



        if (c.contains(a)){
            c.set(c.indexOf(a), "Bulundu");
        }else if (!a.equals("Q")){
            c.add(a);
        }
        }while (!a.equals("Q"));
        System.out.println(c);
    }
}
