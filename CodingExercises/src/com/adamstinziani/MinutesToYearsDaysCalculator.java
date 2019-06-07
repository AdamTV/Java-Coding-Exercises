package com.adamstinziani;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        } else{
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long days_n = 365 * years;
            days -= days_n;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
