package day18arraylistspassbyvalue;

public class PostPreIncrementDecrement {



    public static void main(String[] args) {

        int a = 5;
        //Post Increment
        int b = a++;
        System.out.println(b);

        //Pre Increment
        int c = ++a;
        System.out.println(a);

        //PostDecrement
        int e = 20;
        int f = e--;

        System.out.println(f);

        //PreDecrement
        int y = 30;
        int z = --y;

        System.out.println(z);
    }
}
