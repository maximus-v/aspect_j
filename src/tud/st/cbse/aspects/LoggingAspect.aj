package tud.st.cbse.aspects;

import tud.st.cbse.task4.main.*;

public aspect LoggingAspect {

	pointcut startRunning(ExampleStarter s) : call(* run()) && target(s);
	
	before(ExampleStarter s) : startRunning(s) {
		System.out.println("Start running programm");
	}
	
	after(ExampleStarter s) : startRunning(s) {
		System.out.println("Stop running programm");
	}
	
}
