package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1: [0,2,3,0,12,0]
        // sifirlari en sona koyunuz

        int arr[] = {0,2,3,0,12,0};
        int narr[] = new int[arr.length];

        int indx = 0;

        for (int i = 0; i<arr.length;i++ ){
            if(arr[i]!=0){
                narr[indx]=arr[i];
                indx++;
            }else {
                continue;
            }

        }
        System.out.println(Arrays.toString(narr));

        //Example 2: Bir arrayin icinde herahngi bir elemanin olup olmadigini kontrol eden kodu yaziniz kac kere tekrar ettigini kontrol eden ve gosteren kod/

        int brr[] = {2,1,2,-3,2};
        int eleman = 7;

        int counter = 0;
        for (int w: brr){
            if (w==eleman){
                counter++;
            }
        }
        if (counter>0){
            System.out.println(eleman + " sayisi arrayde " + counter + " defa var ");
        }else {
            System.out.println(eleman + " arrayde yok");
        }
        //Size verilen bir cumledeki en uzun kelimeyi bulani yaziniz.
        //"Java kolaydir calisana, ne kolay ki calismayana"
        String kelime = "Java kolaydir calisana, ne kolay ki calismayana";
        kelime.replaceAll("\\p{Punct}", "");
        String words[] = kelime.split(" ");
        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(words[words.length-1]);

}
}
