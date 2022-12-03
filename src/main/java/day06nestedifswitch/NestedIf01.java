package day06nestedifswitch;

public class NestedIf01 {

    //Password controlu yapan bir kod yaziniz
    // ilk harf buyuk ise A olursa gecerli password aksi halde gecersiz password
    // ilk harf kucuk ise z olursa gecerli password aksi halde gecersiz password

    public static void main(String[] args) {
        String psw = "!xy12!";

        char ilkHarf = psw.charAt(0);

        if(ilkHarf>= 'A' && ilkHarf <=  'Z'){
            if (ilkHarf=='A'){
                System.out.println("gecerli password");
            }else{
                System.out.println("gecersiz password");
            }
        }else if(ilkHarf>= 'a' && ilkHarf<='z'){
            if (ilkHarf=='z'){
                System.out.println("gecerli password");
            }else {
                System.out.println("gecersiz password");
            }
        }else {
            System.out.println("ilk karakter harf olmalidir");
        }

    }
}
