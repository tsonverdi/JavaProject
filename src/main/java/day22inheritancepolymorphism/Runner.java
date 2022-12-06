package day22inheritancepolymorphism;

import java.lang.reflect.AnnotatedElement;

public class Runner {

    public static void main(String[] args) {

        //Inheritanceda variablelar secilirken Java objectin data type ina bakar
        //Oncelikli istediginiz variabli Objectin data typei olan Class'da arar.
        //O classta bulamazsa parent Classlara bakar
        //Hicbir parent classta bulmaz ise hata verir.
        Cat c1 = new Cat();
        System.out.println(c1.a);//14
        System.out.println(c1.b);//34

        Mammal c2 = new Cat();
        System.out.println(c2.a);//13
        System.out.println(c1.c);//45

        Animal c3 = new Cat();
        System.out.println(c3.a);//12

        //Object olustururken Object'in data type'i Child Class'lardan secilemez
        //Inheritance'da "method'lar secilirken Java Constructor'a bakar"
        //Oncelikle, istediginiz method'u Constructori kullanilan Class'dan alir.
        //O Class'da bulamazsa Parent Class'lara bakar.
        //Hicbir yerde o method'u bulamazsa hata verir.

        Cat c4 = new Cat();
        c4.eat();//Cat eat
        c4.drink();//Mammal Drink

        Mammal c5 = new Mammal();
        c5.eat();//Mammal eat

        Animal c6 = new Animal();
        c6.eat();//Animal eat

    }
}
