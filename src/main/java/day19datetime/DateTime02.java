package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

    public static void main(String[] args) {
        //Print formatini degistirmek
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = dtf.format(currentDate);
        System.out.println(formattedDate);//11/30/2022

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2 = dtf2.format(currentDate);
        System.out.println(formattedDate);//Nov/30/2022

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate3 = dtf3.format(currentDate);
        System.out.println(formattedDate);//November/30/2022

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");
        String formattedDate4 = dtf4.format(currentDate);
        System.out.println(formattedDate);//10/30/2022

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/dd/yy");
        String formattedDate5 = dtf5.format(currentDate);
        System.out.println(formattedDate);//10/30/22

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/d/yyyy");
        String formattedDate6 = dtf6.format(currentDate);
        System.out.println(formattedDate);//10/21/22

        //Example 2: Javadan aldiginiz time formatini degistiriniz
        LocalTime myTime = LocalTime.of(16,04,23,31);
        System.out.println(myTime);

        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm");
        String formattedMyTime1 = dtf7.format(myTime);
        System.out.println(formattedMyTime1);

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedMyTime2 = dtf8.format(myTime);
        System.out.println(formattedMyTime2);



    }


}
