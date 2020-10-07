package com.moodanalysis;

public class MoodAnalyser {
    public String analyseMood(String message) {
        if(message.contains("Happy")) {
            return "HAPPY";
        }else{
            return "SAD";
        }
    }
}
