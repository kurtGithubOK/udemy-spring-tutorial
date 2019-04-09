package com.kurtco.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from sp container
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call methods on bean
		System.out.println("From HelloSpringApp, workout is: " + coach.getDailyWorkout());
		System.out.println("From HelloSpringApp, fortune is: " + coach.getDailyFortune());
		
		// close context
		context.close();

	}

}
