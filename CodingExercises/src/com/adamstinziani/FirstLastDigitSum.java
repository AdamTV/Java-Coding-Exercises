package com.adamstinziani;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int sum = -1;
        if (number > -1) {
            int first = number % 10;
            int second;
            while (number > 9) {
                number /= 10;
            }

            second = number;
            sum = first + second;
        }
        return sum;
    }
}
