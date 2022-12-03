package day15arraysmultidimentionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

    //Note: BIr arrayin elemanlari array ise bu arrayler multidimensional arraydir.

    public static void main(String[] args) {

        int arr[][] = new int[3][2];

        arr[1][0]=6;
        arr[0][0]=3;
        arr[0][1]=-4;
        arr[1][1]=18;
        arr[2][0]=-7;
        arr[2][1]=0;
        //Yazdirmak icin
        System.out.println(Arrays.deepToString(arr));
        //Multidimensional Arraylerde array lan elemanlardan biri nasil yazilir?
        System.out.println(Arrays.toString(arr[1]));
        //ic array
        System.out.println(arr[1][0]);

        //Example 1: String bir m array olustur. Eleman ekle. Eleman sayisini yazdur.
        String brr[][] = new String[4][3];
        brr[0][0] = "A";
        brr[0][1] = "B";
        brr[0][2] = "C";
        brr[1][0] = "D";
        brr[1][1] = "E";
        brr[1][2] = "F";
        brr[2][0] = "G";
        brr[2][1] = "H";
        brr[2][2] = "I";
        brr[3][0] = "J";
        brr[3][1] = "K";
        brr[3][2] = "L";

        int sum = 0;
        for (String[] w: brr
             ) {
            sum+=w.length;

        }
        System.out.println(sum);

    }
}
