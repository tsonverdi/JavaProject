package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Example 1:Kullanici gun numarasini girsin. kod gun ismini yazsin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz: ");
        byte g = input.nextByte();

        if (g==1){
            System.out.println("Pazar");
        }else if (g==2){
            System.out.println("Pazartesi");
        }else if (g==3){
            System.out.println("Sali");
        }else if (g==4){
            System.out.println("Carsamba");
        }else if (g==5){
            System.out.println("Persembe");
        }else if (g==6){
            System.out.println("Cuma");
        }else if (g==7){
            System.out.println("Cumartesi");
        }else{
            System.out.println("Boyle bir gun yok");
        }
    }
}
