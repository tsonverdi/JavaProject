package day26exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        String str = "123";//Try kismi calisir
        int result = convertStringToInteger(str);
        System.out.println(result + 5);

        String st = "1a2b";//Exception atar
        int r = convertStringToInteger(st);
        System.out.println(r+10);

    }

    public static int convertStringToInteger (String a){

        int i = 0;
        try {
            //Herhangi bir satirda "Exception" atilirsa Java direkt "catch" bolumune gecer try icindeki sonraki kodlari calistirmaz
            i = Integer.valueOf(a);
            System.out.println("Try Bolumu");

        }catch (NumberFormatException e){
            System.out.println("Rakam olmayan karaketer iceren Stringler Integera cevrilemez");
        }
        return i;
    }
}
