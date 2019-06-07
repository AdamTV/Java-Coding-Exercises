package com.adamstinziani;

 class GreatestCommonDivisor {
    static int getGreatestCommonDivisor(int first, int second) {
        int gcd = -1, fgcd = 0, sgcd = 0;
        if (first > 9 && second > 9) {
            boolean less = first < second;
            int theLess, theMore;
            if (less) {
                theLess = first;
                theMore = second;
            } else {
                theLess = second;
                theMore = first;
            }
            for (int i = 1; i <= theLess; i++) {
                if (theLess % i == 0) {
                    if (theMore % i == 0)
                        gcd = i;
                }
            }
        }
        return gcd;
    }
}
