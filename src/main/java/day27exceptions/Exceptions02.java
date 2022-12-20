package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
    public static void main(String[] args) {



    }

    //Bir text filedaki texti okuayn kodu yaziniz.
    public static void readTheTextFromTheFile() throws IOException {
        FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");

        int k =0;

        while ((k = fis.read())!= -1){
            System.out.println((char)k);
        }
    }


}

