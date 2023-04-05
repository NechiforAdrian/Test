package itschoolS9;

import java.time.LocalDate;// by import some object we can use: import java.time.*(asterix) * = any,all proprieties from local date
import java.time.LocalDateTime;//and now we don"t need this import
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class UtilityClassPractice {

    public static void main(String[] args) {
        Object object = new Object();

        LocalDate localDateNow = LocalDate.now();
        System.out.println(localDateNow);
        LocalDate yesterday = LocalDate.of(2023, 02, 20);

        System.out.println(localDateNow.isAfter(yesterday));
        System.out.println(localDateNow.isBefore(yesterday));

        System.out.println(localDateNow.plusYears(10));// local date is creating an object in back
        System.out.println(localDateNow.minusYears(20));// in this case our real date

        LocalDateTime localDateTimeNow1 = LocalDateTime.now();
        LocalDate test = localDateTimeNow1.toLocalDate();
        System.out.println(localDateTimeNow1);
        System.out.println(test);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(localDateTimeNow1.format(dateTimeFormatter));

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-DD HH-mm-ss");
        System.out.println(localDateTimeNow1.format(dateTimeFormatter1));

        Date utilDate = new Date();
        System.out.println("Util Date: " + utilDate);

        long timestampNow = 1677177435;
        Date sqlDate = new java.sql.Date(timestampNow);
        System.out.println("SQL Date " + sqlDate);



    }
}
