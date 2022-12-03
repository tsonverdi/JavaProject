package day15arraysmultidimentionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {

    public static void main(String[] args) {

        //Multidimensional Array kisa yoldan nasil olusturulur.
        char arr[][] = {{'a','b'},{'q','a','v'},{'w'}};
        System.out.println(Arrays.deepToString(arr));

        //Example 1: Bir String m d arrayde icinde a olan elemanlari konsola yazdiriniz.
        String brr[][] = {{"asa", "hasa"}, {"ev", "loa"}, {"kk", "ll"}, {"jj"}};
        System.out.println(brr);

        String brr2[] = new String[brr.length];

        for (String [] w: brr
             ) { for (String k: w){
                 if (k.contains("a")){
                     System.out.println(k + " ");
                 }

        }

        }
    }
}
