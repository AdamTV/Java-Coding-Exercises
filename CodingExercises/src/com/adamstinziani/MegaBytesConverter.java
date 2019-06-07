package com.adamstinziani;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kB) {
        int mB, rkB;
        mB = kB / 1024;
        rkB = kB % 1024;
        if (kB < 0)
            System.out.println("Invalid Value");
        else
            System.out.println(kB + " KB = " + mB + " MB and " + rkB + " KB");
    }
}
