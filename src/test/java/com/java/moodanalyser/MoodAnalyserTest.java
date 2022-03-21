package com.java.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

//Ability to analyse and respond Happy or Sad Mood

public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Sad Mood");
		Assert.assertEquals("Sad", mood);
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Happy Mood");
		Assert.assertEquals("Happy", mood);
	}
}
