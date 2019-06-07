package com.adamstinziani;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int num = number;
        boolean isFound = false;
        int reverse = 0;
        do{
            int lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }while(num != 0);
        if(number == reverse)
            isFound = true;
        return isFound;
    }
}
