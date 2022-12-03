package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {

        //Example 1: Bir listteki elemanlardan birbirine en yakin olan ikisini bulunuz.

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(12);
        sayilar.add(19);
        sayilar.add(15);
        sayilar.add(30);
        sayilar.add(21);

        Collections.sort(sayilar);

        System.out.println(sayilar);

        int minFark = Integer.MAX_VALUE;

        for (int i = 1; i<sayilar.size();i++){
            minFark = Math.min(minFark,sayilar.get(i) - sayilar.get(i-1));

        }
        System.out.println(minFark);



    }
}
