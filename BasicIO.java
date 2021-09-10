/*
 ╭────────────────────────────────────────────────────╮
 │                                                    ╵
 │ File: BasicIO.java
 │ Project: FirstProject
 │
 │ Created by Everett Wilber on 21/09/09 at 11:30 AM.
 │                                                    ╷
 ╰────────────────────────────────────────────────────╯
 */

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.*;
import java.time.*;

public class BasicIO {
    public static void main(String[] args) {
        // get time zone
        ZoneId defaultZoneId = ZoneId.systemDefault();

        // call vars
        double age = 0;
        Scanner input = new Scanner(System.in);

        //ask name
        System.out.println("Enter UR nam!");
        String name = input.nextLine();
        System.out.println(name);

        //ask birthday
        LocalDate birthday = LocalDate.now();

        //year
        System.out.println("What is your birth year?");
        int year = input.nextInt();
        birthday = birthday.withYear(year);

        //month
        System.out.println("What is your birth month?");
        int month = input.nextInt();
        // is month valid
        while ((month > 12 || month < 1)) {
            System.out.println("Try a number from 1-12");
            month = input.nextInt();
        }
        birthday = birthday.withMonth(month);

        //day
        YearMonth birthMonth = YearMonth.of(year, month);
        System.out.println("What *day* of your birth month?");
        int day = 999999;
        // is month valid
        while (!birthMonth.isValidDay(day)) {
            day = input.nextInt();
        }
        birthday = birthday.withDayOfMonth(day);
        //yearsSince
        int yearsSinceBday = Math.toIntExact(ChronoUnit.YEARS.between(birthday, LocalDate.now()));
        System.out.println("There are "+yearsSinceBday+" years since your birthday");
        //daysAlive
        int daysAlive = Math.toIntExact(ChronoUnit.DAYS.between(birthday, LocalDate.now()));
        System.out.println("You have been alive "+daysAlive+" days!");


        input.close();
    }
}
