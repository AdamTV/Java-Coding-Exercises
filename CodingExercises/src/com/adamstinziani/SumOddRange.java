package com.adamstinziani;

public class SumOddRange {
    public static boolean isOdd(int number) {
        boolean found = false;
        if (number > 0 && number % 2 != 0)
            found = true;
        return found;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i))
                sum += i;
        }
        if (start > end || end < 1 || start < 1)
            sum = -1;
        return sum;
    }
}
