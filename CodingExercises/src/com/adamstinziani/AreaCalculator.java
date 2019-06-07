package com.adamstinziani;

public class AreaCalculator {
    public static double area(double radius){
        double cArea = -1;
        if(radius > -1){
            cArea = radius * radius * Math.PI;
        }
        return cArea;
    }
    public static double area(double x, double y){
        double rArea = -1;
        if(x > -1 && y > -1){
            rArea = x * y;
        }
        return rArea;
    }
}