package day22inheritancepolymorphism;

public class Cat extends Mammal{

    public int a = 14;
    public void eat(){
        System.out.println("Cat Eat");
    }
    public Cat(){
        System.out.println("CatCons");
    }

}