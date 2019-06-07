package com.adamstinziani;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z) {
        boolean found = false;
        if (isValid(x) && isValid(y) && isValid(z)) {
            int x_n = x % 10, y_n = y % 10, z_n = z % 10;
            if (x_n == y_n || y_n == z_n || z_n == x_n)
                found = true;
        }
        return found;
    }

    public static boolean isValid(int number) {
        return number > 9 && number < 1001;
    }
}
