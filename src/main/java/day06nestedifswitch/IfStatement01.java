package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //Kullanicidan yas deger'n' alan ver yas'n hang' evrede oldugunu asagidaki tabloya gore ekranan yazdiriniz
        //0-4 bebek
        //5-12 cocuk
        //13-20 genc
        //21-30 yetiskin
        //tanimlanmamis evre

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz: ");
        int yas = input.nextInt();

        if (yas < 0){
            System.out.println("Gecerli yas giriniz");
        }else if(yas < 5){
            System.out.println("Bebek");
        }else if(yas < 13){
            System.out.println("Cocuk");
        }else if (yas < 21){
            System.out.println("Genc");
        }else if (yas < 31){
            System.out.println("Yetiskin");
        }else{
            System.out.println("Tanimlanmamis evre...");
        }
    }

}

