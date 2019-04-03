package com.lve2code.springdemo;

public class BaseballCoach implements Coach {
	// Override from interface
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

}
