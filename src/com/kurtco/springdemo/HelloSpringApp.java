package com.kurtco.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load spring config file.  same as app ctx?
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from sp container
		Coach coach = context.getBean("myCoach", Coach.class);
		
		// call methods on bean
		System.out.println("From HelloSpringApp, workout is: " + coach.getDailyWorkout());
		System.out.println("From HelloSpringApp, fortune is: " + coach.getDailyFortune());
		
		// close context
		context.close();

	}

}
