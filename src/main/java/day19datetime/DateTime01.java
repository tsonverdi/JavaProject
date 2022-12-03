package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {
        //Example 1: Anlik Tarihi Current Date ekrana yazdiran kodu yaziniz.

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        //Example 2: Anlik zaman Current Time ekrana yazduran kodu yaziniz.
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //Example 3:Tarih ve Zamani anlik yaziniz.
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        //Example 4: Japonyadaki Anlik Tarigi ve zamani ekrana yazdiran kodu yaziniz.
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);

        //Example 5: Istanbul Anlik Tarihi ve zamani ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);

        //Example 6: 789 gun sonra emekli olacaginiza gore emeklilik tarihini hesapla
        LocalDate countDate = LocalDate.of(2022,10,21);
        LocalDate currentDate2 = LocalDate.now();
        LocalDate retireDate = countDate.plusDays(789);

        //Example 7: Cocuklarin dogum tarihleri arsindaki farki gun olarak hesapla
        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013,2,8);

        Long diff = ChronoUnit.DAYS.between(dobVeli,dobAli);
        System.out.println(diff);

        //Example 8: Fetigle Cumhuriyet kurulmasi arasinda kac ay var.
//        29 Mayis 1453 29 Ekim 1923
        LocalDate istanbulunFethi = LocalDate.of(1453,5,29);
        LocalDate cumhuriyetuinKurulus = LocalDate.of(1923,10,29);

        Long ayFarki = ChronoUnit.MONTHS.between(istanbulunFethi,cumhuriyetuinKurulus);
        System.out.println(ayFarki);

        //Example 9: Verilen tarih hangi burcta oldugunu gosteren kodu yaziniz.
        LocalDate myDate = LocalDate.of(1989,12,7);
        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        //1.Yol
        if(day>21 && month==3){
            System.out.println("Koc");
        }else if(day<20 && month==4){
            System.out.println("Koc");
        }
        //2.YOl
        if((day>21 && month==3) || (day<20 && month==4)) {
            System.out.println("Koc");
        }
    }
}
