package com.adamstinziani;

public class NumberOfDaysInMonth {
    static boolean isLeapYear(int year) {
        boolean isLeap = false;
        if (year > 0 && year < 10000) {
            if (year % 4 == 0 && year % 100 != 0)
                isLeap = true;
            if (year % 4 == 0 && year % 400 == 0)
                isLeap = true;
        }
        return isLeap;
    }

    public static int getDaysInMonth(int month, int year) {
        int days = -1;
        if (month > 0 && month < 13 && year > 0 && year < 10000) {
            if (month == 2 && isLeapYear(year))
                days = 29;
            else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                days = 31;
            else if (month == 2)
                days = 28;
            else
                days = 30;
        }
        return days;
    }
}
