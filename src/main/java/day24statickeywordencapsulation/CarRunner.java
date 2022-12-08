package day24statickeywordencapsulation;

public class CarRunner {



    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        //Static variablelara objeleri kullanarak ulasmak mumkun ama tavsiye edilmez.
        System.out.println(car1.price);
        System.out.println(car1.counter);

        //Static variablelara class ismi kullanarak ulasilmalidir.
        System.out.println(car2.price);
        System.out.println(car2.counter);


    }



}
