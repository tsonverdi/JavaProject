package day27exceptions;

public class Exceptions03 {

    public static void main(String[] args)  {



        ///printGrades(60);
        try {checkNameFormat("ali");}
        catch (IllegalNameException e){
            e.getLocalizedMessage();
        }

    }
    //Ogrenci notlarini yazdiran bir method olusturunuz
    public static void printGrades(double grade) throws IllegalGradeException {
        if (grade<0 || grade>100){
            throw new IllegalGradeException("Grade 0 dan az 100 den cok olamaz");
        }else{
            System.out.println(grade);
        }

    }
    //Verilen ismin ilk harfi buyuk olmayinca exception atan bir method yaziniz.
    public static boolean checkNameFormat(String name){
        if(name.charAt(0)>='A' && name.charAt(0)<='Z'){
            return true;
        }else{
            throw new IllegalNameException("Isimler buyuk harfle baslar.");
        }
    }
}
