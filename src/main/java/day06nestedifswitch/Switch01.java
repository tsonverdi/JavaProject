package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    /*
        Kullanicidan gun sayisini aliniz ve gun ismini ekrana yazdiriniz
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarsini giriniz");
        byte gunNo = input.nextByte();
//1. yol
        if(gunNo == 1){
            System.out.println("Pazar");
        }else if(gunNo==2){
            System.out.println("Pazartesi");
        }else if(gunNo==3){
            System.out.println("Sali");
        }else if(gunNo==4){
            System.out.println("Carsamba");
        }else if(gunNo==5){
            System.out.println("Persembe");
        }else if(gunNo==6){
            System.out.println("Cuma");
        }else if(gunNo==7){
            System.out.println("Cumartesi");
        }else{
            System.out.println("gecerli gun numarsi giriniz");
        }
//2.yol
        switch (gunNo){
            case 1:
                System.out.println("s pazar");
                break;
            case 2:
                System.out.println("s pazartesi");
                break;
            case 3:
                System.out.println("s sali");
                break;
            case 4:
                System.out.println("s carsamba");
                break;
            case 5:
                System.out.println("s persembe");
                break;
            case 6:
                System.out.println("s cuma");
                break;
            case 7:
                System.out.println("s cumartesi");
                break;
            default:
                System.out.println("s gecerli gun numarasi giriniz");
        }
    }
}
