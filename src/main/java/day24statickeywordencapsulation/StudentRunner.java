package day24statickeywordencapsulation;

public class StudentRunner {

    public static void main(String[] args) {

        Student std1 = new Student();


        System.out.println(std1.getSdtId());

        System.out.println(std1.getGpa());

        System.out.println("std1.isRetired() = " + std1.isRetired());

        std1.setSdtId("AB");
        System.out.println(std1.getSdtId());

        std1.setGpa(4.0);
        System.out.println(std1.getGpa());//4.0

        std1.setRetired(true);
        System.out.println(std1.isRetired());//true

        Student std2 = new Student();
        System.out.println(std2.getSdtId());



    }
}
