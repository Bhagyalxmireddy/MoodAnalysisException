package com.moodanalysis;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalysis {
    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("this is Happy message");
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("this is Sad message");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenNull_HandleTheException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood(null);
        Assert.assertEquals("HAPPY",mood);
    }
}
