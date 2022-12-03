package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {

    public static void main(String[] args) {

        //Example 1: Japonya ile Almanya arasindaki zaman farkini hesaplayan kodu yaziniz.
        LocalDateTime dateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime dateTimeInDeutschland = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        Long saatFarki = ChronoUnit.HOURS.between(dateTimeInDeutschland,dateTimeInJapan);
        System.out.println(saatFarki);

        //Example 2: Sabit bir tarih olusturunuz
        LocalDate myDate = LocalDate.of(2011, Month.APRIL,13);

        //Example 3: USA icin "Woow!" , UK icin "Big", "CANADA" "Cold" ,TURKEY "Hapishane", GERMANY" "Araba Rwamda Cay
        Countries country = Countries.USA;

        switch (country){
            case USA:
                System.out.println("Waow");
                break;
            case CANADA:
                System.out.println("Cold");
                break;
            case TURKEY:
                System.out.println("Hapishane");
                break;




        }

    }
}
