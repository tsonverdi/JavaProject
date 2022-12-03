package day15arraysmultidimentionalarrays;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example 1: Bir stringteki sesli harflerin sayisini bulan kodu yazini.
        // a-e-i-o-u-A-E-I-O-U
        String str = "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";
        str=str.toLowerCase();
        String letters[]= str.split("");
        System.out.println(Arrays.toString(letters));

        int counter = 0;

        for (String w: letters
             ) {
            switch (w){
                case "a":
                case "e":
                case "o":
                case "i":
                case "u":
                    counter++;
            }

        }
        System.out.println(counter);
    }
}
