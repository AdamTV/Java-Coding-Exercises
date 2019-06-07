package com.adamstinziani;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        long mph_rounded = -1;
        double mph = 0;
        if(kilometersPerHour > 0){
            mph = kilometersPerHour / 1.609;

            mph_rounded = Math.round(mph);
        }
        else if(kilometersPerHour == 0){
            mph_rounded = 0;
        }

        return mph_rounded;
    }

    public static void printConversion(double kilometersPerHour){
        long mph = toMilesPerHour(kilometersPerHour);
        if(kilometersPerHour >= 0){
            System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
        }else{
            System.out.println("Invalid Value");
        }
    }
}
