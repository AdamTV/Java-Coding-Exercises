package com.adamstinziani;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temp){
        return ((summer && temp > 24 && temp < 46) || (!summer && temp > 24 && temp < 36));
    }
}
