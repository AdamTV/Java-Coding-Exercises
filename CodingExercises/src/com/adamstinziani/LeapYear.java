package com.adamstinziani;

public class LeapYear {
    public static boolean isLeapYear(int year){
        boolean isLeap = false;
        if(year > 0 && year < 10000){
            if(year % 4 == 0 && year % 100 != 0)
                isLeap = true;
            if(year % 4 == 0 && year % 400 == 0)
                isLeap = true;
        }
        return isLeap;
    }
}
