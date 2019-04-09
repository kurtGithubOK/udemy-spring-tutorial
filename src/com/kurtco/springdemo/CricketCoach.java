package com.kurtco.springdemo;

public class CricketCoach implements Coach {
	
	FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor.");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method setFortuneService()");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes a day.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
