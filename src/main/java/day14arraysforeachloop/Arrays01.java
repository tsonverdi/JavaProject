package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    //Arrayslerıin icerisine sadece primitive data tipleri yerlestirebilir.
    public static void main(String[] args) {

        String str [] = new String[4];
        str[0] = "Java";
        str[1] = "is";
        str[2] = "was";
        str[3] = "suprised";

        System.out.println(Arrays.toString(str));

        //Example 1: String bir array olusturunuz Tom ve Tomdan onceki tum elemanlari ekrana yazdiriniz

        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};
        for (String w : arr){
            System.out.print(w + " ");
            if (w=="Tom"){
                break;
            }
        }
        System.out.println();

        //Example 2: String array olustrunuz Tom ve Jane haric hepsini yazidinir/
        String brr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};
        for (String w: brr){
            if (w=="Jane" || w=="Tom"){
                continue;
            }
            System.out.print(w + " ");
        }
        System.out.println();
        //Example 3 : Kullanici ile beraber bir array olusturunuz.
        //Bir ogretmenin sinifindaki ogrencilerin isimlerini applicationa yuklenmesini saglayan kodu yaz
        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");
        int numOfStu = input.nextInt();
        String names[] = new String[numOfStu];

        for (int i = 1; i<=numOfStu;i++){
            System.out.println("Lutfen " + i + ". Ogrenci ismi giriniz..");
            System.out.println("Girisi sonlandirmak icin Q harfine basiniz. Devam etmek icin herhangi bir tusa basiniz");

            String name = input.next();
            if (name.equalsIgnoreCase("Q")){
                break;
            }
            names[i-1]= name;



        }
        System.out.println("Ogrencilerin isimleri: " + Arrays.toString(names));
    }
}
