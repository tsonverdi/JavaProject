package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");

        System.out.println(names);

        List<String> names2 = new ArrayList<>();
        names2.add("Trump");
        names2.add("Tom");
        names2.add("Taceddin");


        System.out.println(names);
        List<String> names3 = new ArrayList<>();
        names3.add("Tom");
        names3.add("Thomas");
        names3.add("Tahsin");

        boolean dogruMu = names.containsAll(names3);
        System.out.println(dogruMu);

        //Example 1 : "a" lsitinde  "Shoes lemaninin ilk gorunumunu siliniz.
        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);
        //Example 2 : a listinde Shoes elemaninin tum gorunumlerini siliniz
        a.remove("Shoes");
        System.out.println(a);

        List<String> silinecekler= new ArrayList<>();
        silinecekler.add("Shoes");
        a.removeAll(silinecekler);
        System.out.println(a);

        //Example 3: Bir tane salary listi olusturun eger salary 10kden az ise yuzde 20 cok ise 10 zam yapiniz.
        List<Double> salary = new ArrayList<>();
        salary.add(10000.00);
        salary.add(8654.00);
        salary.add(12343.00);
        salary.add(8654.00);
        salary.add(8654121.00);

        for (Double w : salary
             ) {
            if (w<10000){
                salary.set(salary.indexOf(w),w*1.2 );
            }else if (w>10000){
                salary.set(salary.indexOf(w),w*1.1 );
            }else {
                continue;
            }

        }

        System.out.println(salary);

        //Example 4: Iki arrayin esit olup olmadigini kontol eden kodu yaziniz
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        m.add('t');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.Yol
        int counter = 0;
        for (int i = 0; i<m.size();i++){
            if (m.size()!=n.size()){
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }
            else if (m.get(i)!=n.get(i)){
                counter++;
                System.out.println("Listler esit degildir");
            break;
            }

        }
        if (counter==0){
            System.out.println("listler esittir");
        }
        //2.Yol
        boolean esitMi = m.equals(n);
        if (esitMi){
            System.out.println("Listler esit");
        }else{
            System.out.println("Listler esit degildir");
        }
    }
}
