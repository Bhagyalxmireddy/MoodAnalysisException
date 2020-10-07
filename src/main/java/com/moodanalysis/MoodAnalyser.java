package com.moodanalysis;

import com.moodanalysis.com.moodanalysis.MoodAnalyserException;

public class MoodAnalyser {
    public String analyseMood(String message) throws MoodAnalyserException {
        try{
        if(message.contains("Happy")) {
            return "HAPPY";
        }else {
            return "SAD";
        }
        }catch (NullPointerException e){
            throw new MoodAnalyserException("please enter proper message");
        }

    }
}
