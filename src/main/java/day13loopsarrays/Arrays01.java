package day13loopsarrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays01 {

    public static void main(String[] args) {
        //Nasil array olusturulur
        int stdAges[] = new int[7];//[0, 0, 0, 0, 0, 0, 0]
        //Array nasil yazdirilir
        System.out.println(Arrays.toString(stdAges));
        //Arraylere elemanlar nasil eklenir
        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 12;
        stdAges[4] = 12;
        stdAges[5] = 12;
        stdAges[6] = 10;
        System.out.println(Arrays.toString(stdAges));

        //Arraydeki herhangi bir elemani nasil yazirabiliriz.
        System.out.println(stdAges[4]);

        //Arraydeki en kucuk ve en buyuk elemani ekrana yazdiriniz.
        Arrays.sort(stdAges);
        //yazdirdik yeni hal
        System.out.println(Arrays.toString(stdAges));
        //en kucuk eleman
        System.out.println(stdAges[0]);
        //en buyuk eleman
        System.out.println(stdAges[stdAges.length-1]);

        //Example 2: stdAges tum elemanlarinin toplamini yazdiriniz

        //1.Yol-for
        int sum = 0;
        for (int i =0; i<stdAges.length;i++){

            sum+= stdAges[i];

        }
        System.out.println(sum);
        //2.Yol-while
        int  i =0;
        int sum1 = 0;

        while (i<stdAges.length){

            sum1+= stdAges[i];
            i++;
        }
        //3.Yol-dowhile
        int k =0;
        int sum2 = 0;
        do {
            sum2+=stdAges[k];
            k++;
        }while (k<stdAges.length);
        //4.Yol-for each loop
        int sum3 = 0;
        for (int w : stdAges){
            sum3+=w;

        }
        //Example 3: String bir array olusturunuz. Bu arraya 5 tane isim koyunuz.Bu isimlerdeki karakter sayilarinin toplamini
        //ekrana yazdiriniz
        String stdNames[] = new String[5];
        stdNames[0] = "Ali";
        stdNames[1] = "Ali";
        stdNames[2] = "Ali";
        stdNames[3] = "Ali";
        stdNames[4] = "Ali";

        int karakterSayilariToplami = 0;

        for (String w : stdNames){
            karakterSayilariToplami+= w.length();
        }
        System.out.println(karakterSayilariToplami);

        //Example 4: char bir Array olusturunuz bu Arraya 5 eleman ekleyiniz sonra sadece buyuk harfleri ekrana yazdiriniz.
        char ch[] = {'A', 'c', 'D', 'k', 'm'};

        for (char w : ch){
            if (w>='A'&&w<='Z'){
                System.out.print (w + " ");
            }
        }
    }
}
