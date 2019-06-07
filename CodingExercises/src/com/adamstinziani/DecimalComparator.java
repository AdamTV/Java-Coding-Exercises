package com.adamstinziani;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second){
        boolean equal = false;
        first *= 1000;
        second *= 1000;
        if((int)first == (int)second)
            equal = true;
        return equal;
    }
}
