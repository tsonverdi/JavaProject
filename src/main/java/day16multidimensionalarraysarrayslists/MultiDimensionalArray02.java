package day16multidimensionalarraysarrayslists;

public class MultiDimensionalArray02 {

    public static void main(String[] args) {

        //Bir m d arraydeki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz.

        int arr[][] = {{2,5,1},{83,75}};
        int max = arr[0][0];
        int min = arr[0][1];
        for (int [] w : arr){
            for (int k: w) {

                max = Math.max(max,k);
                min = Math.min(min,k);

            }
        }
        System.out.println("Max deger : " + max + " Min deger: " + min);
    }
}
