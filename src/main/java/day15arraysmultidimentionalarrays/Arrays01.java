package day15arraysmultidimentionalarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //Example 1:
        //binarysearch method
        //eksi gelirse yoktur.
        //once sort yap sonra indexini al
        //indexi de bir varibale a ata ki yazdirabilesin
        //Not:binarysearch methodu tekrarlayan elemanlar icin kullanilmaz.
        int arr[]= {12,31,43,14};

        int sayi = 43;
        int sayi1 = 32;
        Arrays.sort(arr);

        int idx1 = Arrays.binarySearch(arr,sayi);
        int idx2 = Arrays.binarySearch(arr,sayi1);
        System.out.println(idx1);
        System.out.println(idx2);
    }
}
