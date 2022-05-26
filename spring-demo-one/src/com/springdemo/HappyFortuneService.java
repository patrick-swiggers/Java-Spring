package com.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	private String[] data = {
			"Today is your lucky day!",
			"The journey is the reward!",
			"Diligence is the mother of good luck!",
			"Beware of the wolf in sheep's clothing!"
	};
	
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(data.length);
		return data[index];

	}
}
