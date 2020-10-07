package com.moodanalysis;

public class MoodAnalyser {
    public String analyseMood(String message) {
        try{
        if(message.contains("Happy")) {
            return "HAPPY";
        }else {
            return "SAD";
        }
        }catch (NullPointerException e){
            return "HAPPY";
        }

    }
}
