package com.kurtco.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		super();
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it: " + fortuneService.getFortune();
	}
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff()");
	}

	public void doMyShutdownStuff() {
		System.out.println("TrackCoach: inside method doMyShutdownStuff()");
	}
}
