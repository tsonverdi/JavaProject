package day16multidimensionalarraysarrayslists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {


    public static void main(String[] args) {

        //1.Yol
        ArrayList<Integer> ages = new ArrayList<Integer>();
        //2.Yol
        ArrayList<Integer> heights = new ArrayList<>();
        //3.Yol
        List<Integer> nums = new ArrayList<>();
        //print
        System.out.println(nums);
        //nasil eleman eklenir
        nums.add(21);
        nums.add(22);
        nums.add(1,22);
        System.out.println(nums);

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);
        nums.addAll(prices);
        System.out.println(nums);

        nums.addAll(0,prices);
        System.out.println(nums);

        //Array list eleman sayisi:
        int elemanSayisi = nums.size();
        //Herhangi bir eleman nasil secilir
        nums.get(3);

        //Array list bo olup olmadigini nasil anlariz.
        boolean not = nums.isEmpty();
        System.out.println(not);

        //ArrayListte bir eleman nasil degistirilir.
        nums.set(3,200);
        System.out.println(nums);

        //Example 1: nums ArrayListindeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz.

        for (Integer w: nums) {
            if (w%2!=0){
                nums.set(nums.indexOf(w), w+11);
            }

        }
        System.out.println(nums);
        //Remove method icine tam sayi koyarsaniz Java onu index olarak kabul eder.
        Integer sayi = 200;
        nums.remove(sayi);
        nums.addAll(prices);

        System.out.println(nums);
        nums.removeAll(prices);
        System.out.println(nums);






    }
}








