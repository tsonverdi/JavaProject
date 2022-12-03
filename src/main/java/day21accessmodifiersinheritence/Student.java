package day21accessmodifiersinheritence;

public class Student {

/*    Access Modifier
       1)public     2)protected     3)default (Access Modifier'i default yapmak icin access modifier yazmayiz)     4)private
       Note: Access Modifier'lari genisden dara dogru sayiniz
              public > protected > default > private
       Note: Access Modifier'lari birer birer aciklayiniz
              public olanlar her class'dan kullanilabilir
              protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
              default olanlar baska package'den kullanilamazlar
              private olanlar sadece olsturulduklari Class icinde kullanilabilirler
       Note: "protected" ile "default" un farkini soyleyiniz.
               protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
               default olanlar baska package'den kullanilamazlar
       Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
              public, default kullanilir ama protected ve private kullanilamaz
*/
    //Public her classtan kullanilabilir
    public String studentName = "Tom Hanks";

    //protected olanlar baska packagelerden kullanilamaz ancak baska packagede child class icinden kullanilarbilir.
    protected String address = "Miami";

    //Default olanlar baska packageden kullanilamazlar
    String email = "tg@gmail.com";

    //Private olanlar sadece olusturulduklari class icerisinde kullanilabilirler.
    private String stuID = "20206517004";

}
