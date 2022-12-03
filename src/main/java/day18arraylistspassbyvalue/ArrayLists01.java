package day18arraylistspassbyvalue;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        //Example 1: Bir Integer ARrayListeki 7 haric elemanlari 2 artiriniz.
        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w: ages
             ) {if (w==7){
                 continue;
        }else {
                 ages.set(ages.indexOf(w),w+2);
        }

        }
        System.out.println(ages);

        //Example 2: size verilen ARrayListte 8 ve 8'den onceki tum elemanlari iki katina cikariniz.
        List<Integer> ages1 = new ArrayList<>();
        ages1.add(1);
        ages1.add(7);
        ages1.add(21);
        ages1.add(78);
        ages1.add(9);
        //1.yol
        for (Integer w: ages1
             ) {if (w<9){
                 continue;
        }else {
                 ages1.set(ages1.indexOf(w),w*2);
        }

        }
        System.out.println(ages1);

        //2.Yol
        for (Integer w: ages1){
            ages1.set(ages1.indexOf(w),w*2);
            if (w==8){
                break;
            }
        }
    }
}
