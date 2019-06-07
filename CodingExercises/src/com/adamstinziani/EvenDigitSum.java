package com.adamstinziani;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number > -1) {
            while (number > 0) {
                int tmpNum = number % 10;
                if (tmpNum % 2 == 0)
                    sum += tmpNum;
                number /= 10;
            }
        } else {
            sum = -1;
        }
        return sum;
    }
}
