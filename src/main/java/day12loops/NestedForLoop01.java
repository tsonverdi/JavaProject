package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {

    public static void main(String[] args) {
        //Example 1: Asagidaki sekli ekrana yazdiran kodu yaziniz.
        /*
        ****
        ****
        ****
        ****

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz...");
        int satir = input.nextInt();
        System.out.println("Lutfen sutun sayisini giriniz...");
        int sutun = input.nextInt();
        System.out.println("Lutfen karakter giriniz");
        char c = input.next().charAt(0);

        for (int i = 1; i<satir;i++){
            for (int k=1; k<sutun;k++){
                System.out.print(c);
            }
            System.out.println();
        }      */

        //Example 2: Asagidaki sekil cizen kodu yaziniz
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
        for (int i = 1; i<6;i++){
            for (int k = 1;k<=i;k++){
                System.out.print(k+ " ");
            }
            System.out.println();
        }

        //Example 3: Asagidaki sekil cizen kodu yaziniz
        /*
        * * * *
        * * *
        * *
        *
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz...");
        int satir = input.nextInt();
        System.out.println("Lutfen sutun sayisini giriniz...");
        int sutun = input.nextInt();
        System.out.println("Lutfen karakter giriniz");
        char c = input.next().charAt(0);

        for (int i =1;i<satir;i++){
            for (int k=satir;k>i;k--){
                System.out.print(c + " ");

            }
            System.out.println();
        }
    }
}
