package day20stringbuilderstringbuffer;

import java.time.LocalDate;

public class DateTime01 {

    public static void main(String[] args) {
        //Example 1  //Example 1: Tom, Ali'den 3 yıl 8 ay 13 gün sonra doğdu. Ali ise Veli'den 1 yıl 15 gün önce doğdu.
        // Tom'un doğum tarihi 18 Kasım 2011 ise Veli ve Ali'nin doğum tarihlerini bulunuz.

        LocalDate dobTom = LocalDate.of(2011,11,18);

        LocalDate dobAli = dobTom.minusYears(3).minusMonths(8).minusDays(13);

        LocalDate dobVeli = dobAli.plusDays(15).plusYears(1);

        System.out.println(dobAli);
        System.out.println(dobVeli);
    }
}
