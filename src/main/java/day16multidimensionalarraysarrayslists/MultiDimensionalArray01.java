package day16multidimensionalarraysarrayslists;

import java.util.Arrays;

public class MultiDimensionalArray01 {

    public static void main(String[] args) {

        //Bir tane integer m d array olusturunuz
        //Arraydeki tum sayilarin toplamini veren kodu yaziniz.

        int arr[][] = {{2,5,1},{32,75},{13,21,43,56}};
        int sum = 0;

        for (int[] w : arr){
            for (int k: w
                 ) { sum+=k;

            }
        }
        System.out.println(sum);

        //Bir multidimensional arrayi normal arraya ceviren kodu yaziniz.

        int brr[][] = {{2,5,13},{32,75}};
        //once yukardakinin eleman sayisini bulunuz. cunku yeni array uzunluguna ihtiyaci var
        int toplam = 0;

        for (int[] w: brr
             ) {toplam+=w.length;

        }
        int indx = 0;
        int crr[] = new int[toplam];

        for (int [] w : brr
             ) {
            for (int l : w
                 ) {crr[indx]=l;
                indx++;
            }

        }
        System.out.println(Arrays.toString(crr));

    }
}
