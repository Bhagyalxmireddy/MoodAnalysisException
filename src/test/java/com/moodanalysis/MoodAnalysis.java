package com.moodanalysis;

import com.moodanalysis.com.moodanalysis.MoodAnalyserException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalysis {
    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("this is Happy message");
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("this is Sad message");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenNull_HandleTheException() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood(null);
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenMessage_WhenInvalidMood_ThrowCustomException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            mood = moodAnalyser.analyseMood(null);
        }catch(MoodAnalyserException e){
            Assert.assertEquals("please enter proper message",e.getMessage());

        }
    }
    @Test
    public void givenMessage_WhenInvalidEmptyMood_ThrowCustomException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            mood = moodAnalyser.analyseMood("");
        }catch(MoodAnalyserException e){
            Assert.assertEquals("please enter proper message",e.getMessage());

        }
    }
}
