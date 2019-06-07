package com.adamstinziani;

import static com.adamstinziani.SpeedConverter.printConversion;
import static com.adamstinziani.MegaBytesConverter.printMegaBytesAndKiloBytes;
import static com.adamstinziani.BarkingDog.shouldWakeUp;
import static com.adamstinziani.LeapYear.isLeapYear;
import static com.adamstinziani.DecimalComparator.areEqualByThreeDecimalPlaces;
import static com.adamstinziani.EqualSumChecker.hasEqualSum;
import static com.adamstinziani.TeenNumberChecker.hasTeen;
import static com.adamstinziani.AreaCalculator.area;
import static com.adamstinziani.MinutesToYearsDaysCalculator.printYearsAndDays;
import static com.adamstinziani.IntEqualityPrinter.printEqual;
import static com.adamstinziani.PlayingCat.isCatPlaying;
import static com.adamstinziani.NumberPalindrome.isPalindrome;
import static com.adamstinziani.FirstLastDigitSum.sumFirstAndLastDigit;
import static com.adamstinziani.EvenDigitSum.getEvenDigitSum;
import static com.adamstinziani.SharedDigit.hasSharedDigit;
import static com.adamstinziani.LastDigitChecker.hasSameLastDigit;

public class Main {
    public static void main(String[] args) {
        int x = 15, y = 5, z = 20;
        double first = 3.1415, second = 3.1416;
        int year1 = 2019, year2 = 2020;
        int a = 1, c = 5;
        int shared1 = 29, shared2 = 32;
        int kB = 1024000;
        double KPH = 100;
        int temp = 36;
        int palindrome = 1001;
        int number = 246;
        int one = 10, two = 20, three = 32;
        printConversion(KPH);
        printMegaBytesAndKiloBytes(kB);
        System.out.println("My dog is barking before 8:00 a.m., I " + (shouldWakeUp(true, 7) ? "should" : "shan't") + " wake up");
        System.out.println(year1 + " is " + (isLeapYear(year1) ? "" : "not ") + "a leap year");
        System.out.println(year2 + " is " + (isLeapYear(year2) ? "" : "not ") + "a leap year");
        System.out.println(first + " and " + second + " are " + (areEqualByThreeDecimalPlaces(first, second) ? "" : "not ") + "equal to 3 dec precision");
        System.out.println(x + " + " + y + " = " + z + " has " + (hasEqualSum(x, y, z) ? "" : "no ") + "equal sum");
        System.out.println(x + ", " + y + ", " + z + " contains " + (hasTeen(x, y, z) ? "" : "no ") + "teen numbers");
        System.out.println("Area of circle with radius of 1: " + area(1));
        System.out.println("Area of rectangle with length of 10 and width of 5: " + area(10, 5));
        printYearsAndDays(525600);
        System.out.print(a + ", " + a + ", " + c + ": ");
        printEqual(a, a, c);
        System.out.println("Cat is " + (isCatPlaying(true, 36) ? "" : "not ") + "playing at " + temp + " degrees in the summertime");
        System.out.println(palindrome + " is " + (isPalindrome(palindrome) ? "" : "not ") + "a palindrome");
        System.out.println("The sum of the first and last digits of " + number + " is " + sumFirstAndLastDigit(number));
        System.out.println("The sum of the even digits of " + number + " is " + getEvenDigitSum(number));
        System.out.println(shared1 + " and " + shared2 + " have " + (hasSharedDigit(shared1, shared2) ? "" : "no ") + "shared digits in the range of 10-99");
        System.out.println(one + ", " + two + ", " + three + ": at least two of these numbers " + (hasSameLastDigit(one, two, three) ? "share " : "do not share ") + "the same last digit");
    }
}
