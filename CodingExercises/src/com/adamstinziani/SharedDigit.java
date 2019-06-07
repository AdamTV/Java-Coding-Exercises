package com.adamstinziani;

public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y) {
        boolean found = false;
        if (x > 9 && x < 100 && y > 9 && y < 100) {
            int[] x_n = {0,0};
            int[] y_n = {0,0};
            breakNum(x_n, x);
            breakNum(y_n, y);
            if (x_n[0] == y_n[0] || x_n[0] == y_n[1] || x_n[1] == y_n[0] || x_n[1] == y_n[1])
                found = true;
        }
        return found;
    }

    public static void breakNum(int[] n, int num) {
        for (int i = 0; i < 2; i++) {
            n[i] = num % 10;
            num /= 10;
        }
    }
}
