package com.adamstinziani;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean bark, int time){
        return (((time < 8 && time >= 0) || (time == 23)) && bark);
    }
}
