package com.adamstinziani;

public class TeenNumberChecker {
    public static boolean hasTeen(int x, int y, int z){
        return isTeen(x) || isTeen(y) || isTeen(z);
    }
    private static boolean isTeen(int x){
        return (x > 12 && x < 20);
    }
}
